/* Nama File   : OperatorGenetik.java 
 * Deskripsi   : Kelas untuk realisasi operator genetik
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class OperatorGenetik {
    public <T> void Tukar(T a, T b) {
        System.out.println("before : a = " + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("after : a = " + a + ", b = " + b);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}
