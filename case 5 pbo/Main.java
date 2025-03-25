public class Main {
    public static void main(String[] args) {
        // Membuat objek pengguna
        Pengguna user = new Pengguna("Fauzi", "1234", "FauzisolehBGT");

        // Login User
        LoginUser login = new LoginUser();
        boolean isLoginValid = login.validasiLogin("Fauzi", "1234");

        if (isLoginValid) {
            System.out.println("Login berhasil untuk " + user.username);
        } else {
            System.out.println("Login gagal.");
        }

        // Membuat booking
        Booking booking = new Booking();
        booking.getMovies("MV001");
        booking.getMovies("MV002", "Tayang");

        // Membuat tiket dan mencetaknya
        Tiket tiket = new Tiket();
        tiket.username = "FAUZIFRAJA";
        tiket.printTicket();
        tiket.printTicket("bokunopicoMovie");
    }
}
