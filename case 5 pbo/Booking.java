class Booking {
    String buktiTransfer;
    String kodeBooking;
    String kodeMovies;
    String noKursi;
    String status;
    String tglBooking;
    String username;
    
    public void addBooking() {
        // Implementasi booking
    }

    public void getMovies(String kodeMovies) {
        System.out.println("Kode Movie: " + kodeMovies);
    }
    
    public void getMovies(String kodeMovies, String status) {
        System.out.println("Kode Movie: " + kodeMovies + ", Status: " + status);
    }
}