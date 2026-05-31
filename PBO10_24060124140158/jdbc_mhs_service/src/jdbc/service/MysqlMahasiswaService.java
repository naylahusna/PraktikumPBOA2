/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;

/**
 * Nama File : MysqlMahasiswaService.java
 * @author Nayla Husna - 24060124140158
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /** * Membuat objek mahasiswa
     */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }
    
    // Menambahkan data mahasiswa
    public void add(Mahasiswa mhs) {
        if (this.koneksi == null) {
            System.out.println("Gagal tambah data: Koneksi database tidak aktif.");
            return;
        }
        
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
            ps.executeUpdate();
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Error saat insert: " + e.getMessage());
        }
    }
    
    // update data mahasiswa
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // delete data mahasiswa
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                mhs = new Mahasiswa();
                mhs.setId(resultSet.getInt("id"));
                mhs.setNama(resultSet.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }
    
    // ambil semua isi tabel mahasiswa
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        if (this.koneksi == null) {
            System.out.println("Gagal ambil data: Koneksi database tidak aktif.");
            return listMhs; 
        }
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(resultSet.getInt("id"));
                mhs.setNama(resultSet.getString("nama"));
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Error saat getAll: " + e.getMessage());
        }
        return listMhs;
    }
}
