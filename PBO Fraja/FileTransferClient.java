// Import pustaka yang diperlukan untuk mengelola jaringan dan input/output file
import java.io.*;
import java.net.Socket;

// Kelas FileTransferClient untuk mengelola client yang akan mengirim file ke server
public class FileTransferClient {

    // Variabel untuk menyimpan alamat server dan port server
    private String alamatServer;
    private int portServer;

    // Konstruktor untuk menetapkan alamat server dan port
    public FileTransferClient(String alamatServer, int portServer) {
        this.alamatServer = alamatServer;
        this.portServer = portServer;
    }

    // Metode untuk mengirim file ke server
    public void kirimFile(String jalurFile) {
        try {
            // Membuat koneksi ke server dengan alamat dan port yang diberikan
            Socket socket = new Socket(alamatServer, portServer);
            System.out.println("Terhubung ke server: " + alamatServer);

            // Membaca file yang akan dikirim
            FileInputStream fis = new FileInputStream(jalurFile);
            // Mengirim data file ke server
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            // Buffer untuk menyimpan data file sementara
            byte[] buffer = new byte[4096];
            int bytesDibaca;

            // Membaca file dan mengirimnya ke server
            while ((bytesDibaca = fis.read(buffer)) != -1) {
                dos.write(buffer, 0, bytesDibaca);
            }

            // Menutup aliran data dan socket setelah file dikirim
            fis.close();
            dos.close();
            socket.close();

            System.out.println("Transfer file selesai.");
        } catch (IOException e) {
            // Menangani kesalahan jika ada masalah saat mengirim file
            e.printStackTrace();
        }
    }

    // Fungsi utama untuk menjalankan program client
    public static void main(String[] args) {
        // Memastikan argumen program cukup (alamat server dan jalur file)
        if (args.length < 2) {
            System.out.println("Penggunaan: java FileTransferClient <alamat_server> <jalur_file>");
            return;
        }

        // Menyimpan argumen yang diberikan sebagai alamat server dan jalur file
        String alamatServer = args[0];
        String jalurFile = args[1];

        // Membuat objek client dan mengirim file ke server
        FileTransferClient client = new FileTransferClient(alamatServer, 8888);
        client.kirimFile(jalurFile);
    }
}
