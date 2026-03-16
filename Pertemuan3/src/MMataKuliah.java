/* Nama File : MDosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 2 Maret 2026
 */

public class MMataKuliah {
    public static void main(String[] args){
        MataKuliah MK1 = new MataKuliah();
        MK1.set_idMatKul("PBO");
        MK1.setNama("Pemrograman Berorientasi Objek");
        MK1.setSks(3);

        System.out.println("ID Mata Kuliah: " + MK1.getidMatKul());
        System.out.println("Nama Mata Kuliah: " + MK1.getNama());
        System.out.println("Jumlah SKS: " + MK1.getSks());

    }
}
