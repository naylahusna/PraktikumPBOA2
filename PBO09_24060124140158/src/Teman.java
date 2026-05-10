/* Nama file : Teman.java
   Deskripsi : Kelas yang berisi informasi tentang teman
   Pembuat : Nayla Husna/24060124140158
   Tanggal : 4 Mei 2026 */

import java.util.ArrayList;
import java.util.List;

public class Teman<T> {
    // ATRIBUT
    private int nbelm;
    private List<String> Lnama;

    //METHOD
    // Konstruktor tanpa parameter
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // konstruktor dengan parameter
    public Teman(int nbelm, List<String> Lnama) {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // mengembalikan jumlah elemen
    public int getNbElm() {
        return this.nbelm;
    }

    // mengambil nama berdasarkan indeks
    public String getNama(int indeks) {
        return this.Lnama.get(indeks - 1);
    }

    // mengubah nama pada indeks tertentu
    public void setNama(int indeks, String nama) {
        this.Lnama.set(indeks - 1, nama);
    }

    // menambah nama baru ke dalam kolensi
    public void addNama(String nama){
        this.nbelm = this.nbelm + 1;
        this.Lnama.add(nama);
    }

    // menghapus nama tertentu dari koleksi
    public void delNama(String nama){
        if (this.Lnama.remove(nama)){
            this.nbelm = this.nbelm - 1;
        }
    }

    // memeriksa apakah nama ada dalam koleksi
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // mengganti nama lama dengan nama baru
    public void gantiNama(String nama, String namabaru){
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1){
            this.Lnama.set(indeks, namabaru);
        }
    }

    // menghitung banyak kemunculan suatu nama
    public int countNama(String nama){
        int count = 0;
        for (int i = 0; i < getNbElm(); i++){
            if (Lnama.get(i).equals(nama)){
                count++;
            }
        }
        return count;
    }

    // menampilkan semua data teman dalam Lnama
    public void showTeman(){
        System.out.print("Daftar Teman: ");
        for (int i = 0; i < this.nbelm; i++) {
            System.out.print(Lnama.get(i) + (i < nbelm - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

