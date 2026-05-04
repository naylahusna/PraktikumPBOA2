/* Nama File   : Data.java 
 * Deskripsi   : Kelas generik dengan atribut larik statik dan metode aksesnya
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class Data<T> {
    //atribut
    private T[] ruang;
    private int banyak;

    @SuppressWarnings("unchecked")
    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    public void setIsi(int pos, T objek) {
        if (pos >= 1 && pos <= 100) {
            if (ruang[pos - 1] == null) {
                banyak++;
            }
            ruang[pos - 1] = objek;
        } else {
            System.out.println("Luas Batasan");
        }
    }

    public T getIsi(int posisi) {
        return (T) ruang[posisi - 1];
    }

    public int getSize() {
        return banyak;
    }


    public Object[] getRuang() {
        return ruang;
    }

    public int getBanyak() {
        return banyak;
    }
}
