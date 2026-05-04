/* Nama File   : MData.java 
 * Deskripsi   : Kelas untuk mengilustrasikan kelas genetik Data
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class MData {
    public static void main(String[] args) {
        Data<Anabul> anabul = new Data<>();
        anabul.setIsi(1, new Anjing("Vivi"));
        anabul.setIsi(2, new Burung("Sudi"));

        System.out.println("Isi di posisi 1: " + anabul.getIsi(1));
        System.out.println("Isi di posisi 2: " + anabul.getIsi(2));
        System.out.println("Isi di posisi 3: " + anabul.getIsi(3));
        
        System.out.println("Banyak elemen: " + anabul.getSize());
    }
}
