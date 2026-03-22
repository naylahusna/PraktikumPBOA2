/* Nama File : Manusia.java
 * Deskripsi : berisi atribut dan method dalam class Manusia
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

package Pajak;

import java.util.Date;

public abstract class Manusia {
    /* ATRIBUT */
    protected String nama;
    protected java.util.Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;


    /* METHOD */

    // Konstruktor tanpa parameter
    public Manusia(){
    }

    // konstruktor dengan parameter
    public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = new Date();
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selektor
    public String getNama(){
        return nama;
    }

    public Date getTgl_mulai_kerja(){
        return tgl_mulai_kerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    // Mutator
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(Date tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns(){
        return counterMns;
    }


    // Abstract Method
    public abstract int hitungMasaKerja();

    public void cetakInfo(){
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + pendapatan);
    }
}
