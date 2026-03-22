/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class Bangun Datar
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

public abstract class BangunDatar {
    /***** ATRIBUT *****/
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    /***** METHOD *****/
    protected BangunDatar(){
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    }

    //abstract method
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }

    public void printInfo(){
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar : " + counterBangunDatar);
    }
}
