/* Nama File   : Anjing.java 
 * Deskripsi   : Kelas untuk representasi anjing
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public class Anjing extends Anabul {
    public Anjing(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void suara() {
        System.out.println(nama + " bersuara 'guk-guk'");
    }
    
}
