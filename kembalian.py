def min_coin_change(coins, amount):
    # Buat array untuk menyimpan jumlah minimum koin yang diperlukan untuk setiap jumlah
    dp = [float('inf')] * (amount + 1)
    
    # Buat array untuk melacak koin yang digunakan
    coin_used = [-1] * (amount + 1)

    # Untuk jumlah 0, dibutuhkan 0 koin
    dp[0] = 0

    # Loop untuk menghitung jumlah minimum koin untuk setiap jumlah
    for i in range(1, amount + 1):
        for coin in coins:
            if i - coin >= 0 and dp[i - coin] + 1 < dp[i]:
                dp[i] = dp[i - coin] + 1
                coin_used[i] = coin  # Melacak koin yang digunakan

    # Jika tidak ada kombinasi koin yang dapat membuat jumlah yang diinginkan
    if dp[amount] == float('inf'):
        return -1, []
    
    # Backtrack untuk menemukan kombinasi koin yang digunakan
    result = []
    current_amount = amount
    while current_amount > 0:
        result.append(coin_used[current_amount])
        current_amount -= coin_used[current_amount]

    return dp[amount], result

# Daftar koin yang tersedia
coins = [2, 3, 5, 10, 15]

# Jumlah yang ingin ditukar
amount = 20

# Panggil fungsi
result_count, result_coins = min_coin_change(coins, amount)

# Cetak hasilnya
if result_count != -1:
    print(f"Jumlah minimum koin yang diperlukan: {result_count}")
    print(f"Koin yang digunakan: {result_coins}")
else:
    print("Tidak ada kombinasi koin yang dapat membuat jumlah yang diinginkan.")

 