/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

public class Kendaraan {
    /*****ATRIBUT*****/
    private String noPlat;
    private String jenis;
    
    /*****METHOD*****/
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    //mutator
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        if (jenis.equalsIgnoreCase("Mobil") || jenis.equalsIgnoreCase("Motor")){
            this.jenis = jenis;
        } else {
            System.out.println("Jenis Kendaraan Tidak Cocok");
        }
    }

}
