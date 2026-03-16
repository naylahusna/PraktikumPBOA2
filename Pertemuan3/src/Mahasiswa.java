/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

import java.util.ArrayList;
public class Mahasiswa {

    //******** ATRIBUT ********
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    /********** METHOD ********/

    //Konstruktor untuk Mahasiswa tanpa parameter
    public Mahasiswa(){
        this.listMatKul = new ArrayList<>(); // inisialiasi arraylist kosong
    }

    //Konstruktor untuk Mahasiswa dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(); // inisialiasi arraylist kosong
    }

    //****** Mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void addMatKul (MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public void setDosenWali(Dosen dosenwali){
        this.dosenwali = dosenwali;
    }

    public void setKendaraan (Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // ******* SLEEKTOR
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public Dosen getDoswal(){
        return dosenwali;
    }

    public Kendaraan getKend(){
        return kendaraan;
    }

    public ArrayList<MataKuliah> getListMatKul(){
        return listMatKul;
    }

    // --- METHOD LAIN ---

    //mendapatkan jumlah SKS mata kuliah yang diambil mahasiswa
    public int getJumlahSKS(){
        int jumlah = 0;
        for (MataKuliah mk : listMatKul){
            jumlah += mk.getSks();
        }
        return jumlah;
    }

    //mendapat jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatKul(){
        return listMatKul.size();
    }

    // menampilkan nim, nama, dan prodi mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // menampilkan nim, nama, prodi, daftar mata kuliah yang diambil, data dosen wali, serta data kendaraan yang dimiliki mahasiswa.
    public void printDetailMhs(){
        System.out.println("= DETAIL MAHASISWA =");
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);

        System.out.println("\nDaftar Mata Kuliah");
        if (listMatKul == null) {
            System.out.println("(Belum mengambil Mata Kuliah)");
        } else {
            for (MataKuliah mk : listMatKul) {
                System.out.println("- " + mk.getidMatKul() + " : " + mk.getNama() + " (" + mk.getSks() + " SKS)");
            }
        }

        System.out.println("\nData Dosen Wali");
        if (dosenwali != null) {
            System.out.println("NIP   : " + dosenwali.getNip());
            System.out.println("Nama  : " + dosenwali.getNama());
            System.out.println("Prodi : " + dosenwali.getProdi());
        } else {
            System.out.println("Belum ada Dosen Wali.");
        }

        System.out.println("\nData Kendaraan");
        if (kendaraan != null) {
            System.out.println("No Plat : " + kendaraan.getNoPlat());
            System.out.println("Jenis   : " + kendaraan.getJenis());
        } else {
            System.out.println("Mhs tidak memiliki kendaraan.");
        }
    }
}
