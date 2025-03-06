import java.io.*;
import java.net.*;

public class Client {
    private Socket socket;
    private DataOutputStream dataOutputStream;
    private FileInputStream fileInputStream;

    public Client(String serverAddress, int port, String filePath) {
        try {
            // Membuat koneksi ke server
            socket = new Socket(serverAddress, port);
            System.out.println("Terhubung ke server!");

            // Mendapatkan output stream ke server
            dataOutputStream = new DataOutputStream(socket.getOutputStream());

            // Mengirim nama file
            File file = new File(filePath);
            dataOutputStream.writeUTF(file.getName());

            // Membaca file yang akan dikirim
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                dataOutputStream.write(buffer, 0, bytesRead);
            }

            // Menutup semua aliran dan socket
            fileInputStream.close();
            dataOutputStream.close();
            socket.close();

            System.out.println("File " + file.getName() + " berhasil dikirim ke server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client("localhost", 5000, "path_to_file");  // Alamat server dan file yang akan dikirim
    }
}
