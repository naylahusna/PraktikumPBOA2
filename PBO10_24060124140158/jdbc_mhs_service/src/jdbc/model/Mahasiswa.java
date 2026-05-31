/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 * Nama File : Mahasiswa.java
 * @author Nayla Husna - 24060124140158
 */
public class Mahasiswa {
    private int id;
    private String nama;
    
    // Konstruktor tanpa parameter
    public Mahasiswa() {
    }

    // Konstruktor dengan parameter
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengubah objek menjadi bentuk teks saat dicetak
    @Override
    public String toString() {
        return "Mahasiswa {" + "id=" + id + ", nama=" + nama + '}';
    }
}
