/* Nama File : MataKuliah.java
 * Deskripsi : berisi atribut dan method dalam class Mata Kuliah
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

public class MataKuliah {
    /*****ATRIBUT*****/
    private String idMatKul;
    private String nama;
    private int sks;

    /*****METHOD*****/
    //konstuktor tanpa parameter
    public MataKuliah(){
        this.idMatKul = "";
        this.nama =  "";
        this.sks = 0;
    }

    //konstruktor dengan parameter
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama =  nama;
        this.sks = sks;
    }

    //Selektor
    public String getidMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    //Mutator
    public void set_idMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

}
