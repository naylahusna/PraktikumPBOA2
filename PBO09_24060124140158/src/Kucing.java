/* Nama File   : Kucing.java 
 * Deskripsi   : Kelas untuk representasi kucing
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi 'meow'");
    }   

    public String toString() {
        return "Kucing: " + nama + ", Bobot: " + bobot + " kg";
    }
}
