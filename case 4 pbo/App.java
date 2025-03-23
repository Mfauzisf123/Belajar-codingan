public class App {
    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar("Acoustic", "Yamaha");
        guitar.playSound();
        guitar.info();

        System.out.println("________________________");

        MusicalInstrument piano = new Piano("Grand", "Steinway");
        piano.playSound();
        piano.info();
    }
}
