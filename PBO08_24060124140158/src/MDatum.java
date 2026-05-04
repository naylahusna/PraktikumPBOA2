/* Nama File   : MDatum.java 
 * Deskripsi   : Kelas untuk mengilustrasikan kelas genetik Datum
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class MDatum {
    public static void main(String[] args) {
        Datum<Anggora> dataAnggora = new Datum<>();
        dataAnggora.setIsi(new Anggora("Micky", 4.5));
        System.out.println("Isi Anggora: " + dataAnggora.getIsi());

        Datum<Kembangtelon> dataKembangtelon = new Datum<>();
        dataKembangtelon.setIsi(new Kembangtelon("Mimiw", 3.2));
        System.out.println("Isi Kembangtelon: " + dataKembangtelon.getIsi());
    }
}
