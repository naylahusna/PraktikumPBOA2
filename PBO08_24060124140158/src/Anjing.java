/* Nama File   : Anjing.java 
 * Deskripsi   : Kelas abstrak untuk representasi anjing
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
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
