/* Nama File   : Kembangtelon.java 
 * Deskripsi   : Kelas untuk representasi kucing kembangtelon
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, String panggilan, double bobot) {
        super(nama, panggilan, bobot);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }       

    @Override
    public void suara() {           
        System.out.println(nama + " berbunyi 'meow meow'");
    }
}
