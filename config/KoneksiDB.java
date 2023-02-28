/*
File ini berfungsi untuk mengkoneksikan aplikasi ke database (MySQL)
port        = 3306
user        = root
database    = ukk_spp1
password    = False
*/

// Import library
package config;
    import java.sql.*;
    import javax.swing.JOptionPane;

public class KoneksiDB {
    static Connection con;
    public static int executeUpdate;
    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ukk_spp1", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Koneksi DB Gagal!");
            System.exit(0);
        }
        return con;
    }
}
