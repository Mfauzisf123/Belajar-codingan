import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private DataInputStream dataInputStream;
    private FileOutputStream fileOutputStream;

    public Server(int port) {
        try {
            // Membuka server pada port tertentu
            serverSocket = new ServerSocket(port);
            System.out.println("Server dimulai. Menunggu koneksi...");

            // Menerima koneksi dari client
            socket = serverSocket.accept();
            System.out.println("Client terhubung!");

            // Mendapatkan input dari client
            dataInputStream = new DataInputStream(socket.getInputStream());

            // Menerima nama file
            String fileName = dataInputStream.readUTF();
            fileOutputStream = new FileOutputStream(new File(fileName));

            // Membaca data file dari client
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = dataInputStream.read(buffer, 0, buffer.length)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            // Menutup semua aliran dan socket
            fileOutputStream.close();
            dataInputStream.close();
            socket.close();
            serverSocket.close();

            System.out.println("File " + fileName + " berhasil diterima.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server(5000);  // Port server 5000
    }
}
