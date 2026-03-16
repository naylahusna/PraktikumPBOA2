/* Nama File : Tendik.java
 * Deskripsi : berisi atribut dan method dalam class Tendik
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 15 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    /***** ATRIBUT *****/
    protected String bidang;

    /***** METHOD *****/
    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang){
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP              : " + nip); 
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + tglLahir);
        System.out.println("TMT              : " + tmt);
        System.out.println("Jabatan          : Tenaga Kependidikan");
        System.out.println("Bidang           : " + bidang);
        System.out.println("Masa Kerja       : " + getMasaKerja());
        System.out.println("Tanggal Pensiun  : " + Pensiun(55));
        System.out.println("Gaji Pokok       : " + gajiPokok);

        //tunjangan
        Period mk = Period.between(tmt, LocalDate.now());
        double tunjangan = 0.01 * mk.getYears() * gajiPokok;
        System.out.printf("Tunjangan        : 1%% x %d x Rp %.2f = Rp %.2f\n", mk.getYears(), gajiPokok, tunjangan);
    }
}
