/* Nama File   : MGenetik.java 
 * Deskripsi   : Kelas untuk aplikasi prosedur operator genetik
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 27 April 2026 */

public class MGenetik {
    public static void main(String[] args) {
        OperatorGenetik op = new OperatorGenetik();

        //sesama integer
        op.Tukar(3, 6);
        System.out.println();
        //sesama string
        op.Tukar("Kucing", "Anjing");
        System.out.println();
        //sesama anabul
        Anggora a1 = new Anggora("Micky", 3.5);
        Kembangtelon k2 = new Kembangtelon("Blacky", 4.2);
        op.Tukar(a1, k2);
        System.out.println();

        double totalBobot = OperatorGenetik.Bobot2(a1, k2);
        System.out.println("Total Bobot: " + totalBobot + " kg");
    }
}
