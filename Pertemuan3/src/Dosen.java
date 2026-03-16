/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

public class Dosen {

    /**** ATRIBUT ****/
    private String nip;
    private String nama;
    private String prodi;

    /**** METHOD ****/
    // kosntruktor tanpa parameter
    public Dosen(){
    }

    // kosntruktor dengan parameter
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // mutator
    // mengubah NIP Dosen
    public void setNip(String nip){
        this.nip = nip;
    }

    // mengubah Nama Dosen
    public void setNama(String nama){
        this.nama = nama;
    }

    // mengubah Prodi Dosen
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    // selektor
    // mengembalikan nilai NIP Dosen
    public String getNip(){
        return nip;
    }

    // mengembalikan Nama Dosen
    public String getNama(){
        return nama;
    }

    // mengembalikan Prodi Dosen
    public String getProdi(){
        return prodi;
    }
}
