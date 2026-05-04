/* Nama File : Petani.java
 * Deskripsi : berisi atribut dan method dalam class Petani
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

package Pajak.src;

import java.util.Calendar;
import java.util.Date;

public class Petani extends Manusia implements IPajak{
    /* ATRIBUT */
    protected String asal_kota;
    protected static int counterPetani;
    
    /* METHOD */
    // konstruktor tanpa parameter
    public Petani(){
    }

    // konstruktor dengan parameter
    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor
    public String getAsal_kota(){
        return asal_kota;
    }

    // Mutator
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja(){
        Calendar now = Calendar.getInstance();
        Calendar mulai = Calendar.getInstance();
        mulai.setTime(tgl_mulai_kerja);

        int C = 1; // digit terakhir 158

        int tahun = now.get(Calendar.YEAR) - mulai.get(Calendar.YEAR);
        mulai.set(Calendar.YEAR, now.get(Calendar.YEAR));
        if (now.before(mulai)){
            tahun--;
        }

        return tahun + C;
    }

    @Override
    public double hitungPajak(){
        return 0;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP                : " + asal_kota);
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + hitungPajak());
    }
}


