/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 * Nama File : MysqlUtility.java
 * @author Nayla Husna - 24060124140158
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3307/jdbc_mhs"; 
                // sesuaikan username dan password
                String user = "nayla";
                String password = "nayla";
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi ke database XAMPP berhasil!");
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Koneksi gagal: " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
