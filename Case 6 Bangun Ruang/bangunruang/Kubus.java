package bangunruang;

public class Kubus extends BangunRuang implements Operasi {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Overriding method dari abstract class
    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }

    // Overloading method (contoh)
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = (double) sisi;
    }

    // Implementasi dari interface
    @Override
    public void tampilkanHasil() {
        System.out.println("Kubus:");
        System.out.println("Volume: " + volume());
        System.out.println("Luas Permukaan: " + luasPermukaan());
    }
}

