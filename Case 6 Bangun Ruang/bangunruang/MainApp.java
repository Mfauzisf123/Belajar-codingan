package bangunruang;

public class MainApp {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(4);
        kubus.tampilkanHasil();

        System.out.println();

        Balok balok = new Balok(4, 3, 2);
        balok.tampilkanHasil();

        // Contoh overloading
        kubus.setSisi(6); // pakai int
        balok.setUkuran(5.5, 2.5, 3.0); // pakai double

        System.out.println("\nSetelah diubah ukurannya:");
        kubus.tampilkanHasil();
        System.out.println();
        balok.tampilkanHasil();
    }
}
