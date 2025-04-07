package bangunruang;

public class Balok extends BangunRuang implements Operasi {
    private double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Overriding
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }

    // Overloading method
    public void setUkuran(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void setUkuran(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Interface implementation
    @Override
    public void tampilkanHasil() {
        System.out.println("Balok:");
        System.out.println("Volume: " + volume());
        System.out.println("Luas Permukaan: " + luasPermukaan());
    }
}



