/* Nama File   : Burung.java 
 * Deskripsi   : Kelas abstrak untuk representasi burung
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi 'cuit'");
    }
}
