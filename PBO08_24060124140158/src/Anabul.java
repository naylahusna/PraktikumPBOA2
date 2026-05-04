/* Nama File   : Anabul.java 
 * Deskripsi   : Kelas abstrak untuk representasi hewan
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return this.nama;
    }

    // Method abstrak 
    public abstract void gerak();
    public abstract void suara();
}