/* Nama File   : Burung.java 
 * Deskripsi   : Kelas untuk representasi burung
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public class Burung extends Anabul {
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
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
