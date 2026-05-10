/* Nama File   : Anabul.java 
 * Deskripsi   : Kelas abstrak untuk representasi hewan
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public abstract class Anabul {
    protected String nama;
    protected String panggilan;

    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }

    public String getNama() {
        return this.panggilan;
    }

    public void setNama(String nama) {
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