/* Nama File : Manusia.java
 * Deskripsi : berisi atribut dan method dalam class Manusia
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

package Pajak;

import java.util.Calendar;
import java.util.Date;

public class PNS extends Manusia implements IPajak {
    /* ATRIBUT */
    protected String nip;
    protected static int counterPNS;

    /* METHOD */
    // kontruktor tanpa parameter
    public PNS(){
    }

    // konstruktor dengan parameter
    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja(){
        Calendar now = Calendar.getInstance();
        Calendar mulai = Calendar.getInstance();
        mulai.setTime(tgl_mulai_kerja);

        int A = 8; // digit terakhir 158

        int tahun = now.get(Calendar.YEAR) - mulai.get(Calendar.YEAR);
        mulai.set(Calendar.YEAR, now.get(Calendar.YEAR));
        if (now.before(mulai)){
            tahun--;
        }

        return tahun + A;
    }

    @Override
    public double hitungPajak(){
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                 : " + nip);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
    }
    
}
