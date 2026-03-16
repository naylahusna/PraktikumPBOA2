/* Nama File : Pegawai.java
 * Deskripsi : berisi atribut dan method dalam class Pegawai
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    /***** ATRIBUT *****/
    protected String nip ;
    protected String nama ;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;


    /***** METHOD *****/
    //konstruktor tanpa parameter
    public Pegawai(){
    }

    //konstruktor dengan parameter
    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja(){
        Period p = Period.between(tmt, LocalDate.now());
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public LocalDate Pensiun(int bup){
        return tglLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    //printinfo
    public void printInfo(){
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT           : " + tmt);
        System.out.println("Gaji Pokok    : Rp." + gajiPokok);
    }
}
