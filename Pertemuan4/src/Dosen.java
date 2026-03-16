/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 15 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    /***** ATRIBUT *****/
    protected String fakultas;

    /***** METHOD *****/
    //konstruktor
    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
