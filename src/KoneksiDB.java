
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class KoneksiDB {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/skripsi_db";
        String user = "root";          // Ganti kalau pakai user lain
        String pass = "";              // Ganti sesuai password MySQL kamu
        return DriverManager.getConnection(url, user, pass);
    }

    
}
