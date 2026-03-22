/* Nama File : Pengusaha.java
 * Deskripsi : berisi atribut dan method dalam class Pengusaha
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

package Pajak;

import java.util.Calendar;
import java.util.Date;

public class Pengusaha extends Manusia implements IPajak{
    /* ATRIBUT */
    protected String npwp;
    protected static int counterPengusaha;

    /* METHOD */
    // konstruktor tanpa parameter
    public Pengusaha(){
    }

    // konstruktor dengan parameter
    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor
    public String getNPWP(){
        return npwp;
    }

    // Mutator
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja(){
        Calendar now = Calendar.getInstance();
        Calendar mulai = Calendar.getInstance();
        mulai.setTime(tgl_mulai_kerja);

        int B = 5; // digit terakhir 158

        int tahun = now.get(Calendar.YEAR) - mulai.get(Calendar.YEAR);
        mulai.set(Calendar.YEAR, now.get(Calendar.YEAR));
        if (now.before(mulai)){
            tahun--;
        }

        return tahun + B;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
    }
}
