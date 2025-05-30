import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/belajar_java_database"; // perhatikan huruf kecil
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            if (conn.isValid(5)) {
                createData(conn);
                updateData(conn);
                deleteData(conn);
                readData(conn);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createData(Connection conn) throws SQLException {
        String query = "INSERT INTO belajar_java_database (name, sku, price, description) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "School Bag");
            pstmt.setString(2, "SKU00012");
            pstmt.setDouble(3, 1000000.0);
            pstmt.setString(4, "Fauzi mahasiswa semester 4");
            pstmt.executeUpdate();
            System.out.println("Data created successfully");
        }
    }

    private static void updateData(Connection conn) throws SQLException {
        String query = "UPDATE belajar_java_database SET sku = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "SKUACR00011");
            pstmt.setInt(2, 1); // ganti jadi int karena id bertipe int
            pstmt.executeUpdate();
            System.out.println("Data updated successfully");
        }
    }

    private static void deleteData(Connection conn) throws SQLException {
        String query = "DELETE FROM belajar_java_database WHERE sku = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, "SKU00012");
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully");
        }
    }

    private static void readData(Connection conn) throws SQLException {
        String query = "SELECT * FROM belajar_java_database";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("+------------------+----------------+----------------+--------------------------+");
            System.out.println("| Name             | SKU            | Price          | Description              |");
            System.out.println("+------------------+----------------+----------------+--------------------------+");

            while (rs.next()) {
                String name = rs.getString("name");
                String sku = rs.getString("sku");
                double price = rs.getDouble("price");
                String description = rs.getString("description");

                System.out.printf("| %-16s | %-14s | %-14.2f | %-24s |\n",
                        name, sku, price, description);
            }

            System.out.println("+------------------+----------------+----------------+--------------------------+");
        }
    }
}
