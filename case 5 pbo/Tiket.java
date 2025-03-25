class Tiket {
    String username;
    String kodeMovies;
    String jamTayang;
    String kodeBooking;
    
    public void printTicket() {
        System.out.println("Tiket untuk: " + username);
    }
    
    public void printTicket(String kodeMovies) {
        System.out.println("Tiket untuk film: " + kodeMovies);
    }
}
