/* Nama File   : Datum.java 
 * Deskripsi   : Kelas abstrak untuk representasi class generik 
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class Datum<T>{
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}
