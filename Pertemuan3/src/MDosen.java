/* Nama File : MDosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

public class MDosen {
    public static void main(String[] args){
        Dosen D1 = new Dosen();
        D1.setNip("1234");
        D1.setNama("Nayla");
        D1.setProdi("Informatika");

        System.out.println("NIP: " + D1.getNip());
        System.out.println("Nama: " + D1.getNama());
        System.out.println(("Prodi: " + D1.getProdi()));
    }

}
