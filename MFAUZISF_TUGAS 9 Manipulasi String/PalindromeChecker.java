

public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "mobil";
        
        if (isPalindrome(word)) {
            System.out.println(word + "adalah palindrome.");
        }else{
            System.err.println(word + "bukan palindrome.");
        }
      
    }

    public static boolean isPalindrome(String input){
        String clean = input.replaceAll("\\s+","");
        String reverse = new 
    StringBuilder(clean).reverse().toString();
    return clean.equals(reverse);
    }
}

