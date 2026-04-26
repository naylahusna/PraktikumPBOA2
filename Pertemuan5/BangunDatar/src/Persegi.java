/* Nama File : Persegi.java
 * Deskripsi : berisi atribut dan method dalam class Persegi
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    /***** ATRIBUT *****/
    private double sisi;

    /***** METHOD *****/
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi(){
        return sisi;
    }

    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    // bikin print info lengkap buat persegi
    public void printInfoLeng(){
        System.out.println("Jumlah sisi : " + getJmlSisi());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Border      : " + getBorder());
        System.out.println("Sisi        : " + sisi);
    }

    @Override
    public void printInfo(){
        System.out.println("Sisi        : " + sisi);
    }

    //abstract method
     public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return 4 * sisi;
    }

    //interface
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
    
    // public void printCounterBangunDatar(){
    //     super.printCounterBangunDatar();
    //     System.out.println("Sisi : " + sisi);
    // }
}
