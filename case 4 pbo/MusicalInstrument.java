abstract class MusicalInstrument {
    protected String type;
    protected String brand;

    public MusicalInstrument(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public abstract void playSound();

    public void info() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
}
