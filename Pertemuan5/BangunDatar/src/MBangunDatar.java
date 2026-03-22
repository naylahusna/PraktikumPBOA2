/* Nama File : MBangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 16 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        P1.setSisi(15);

        System.out.println("PERSEGI");
        P1.printInfo();
        System.out.println("Luas Persegi     : " + P1.getLuas());
        System.out.println("Keliling Persegi : " + P1.getKeliling());
        System.out.println("Diagonal Persegi : " + P1.getDiagonal());

        Lingkaran L1 = new Lingkaran();
        L1.setJari(14);

        System.out.println("\nLINGKARAN");
        L1.printInfo();
        System.out.println("Keliling Lingkaran : " + L1.getKeliling());
        System.out.println("Luas Lingkaran : " + L1.getLuas());

        // *** ABSTRACT ***

        // BangunDatar P2 = new BangunDatar();  
        // diatas ini error karena kelas abstrak tidak dapat diinstantiasi
        // tetapi dapat digunakan sebagai tipe data

        BangunDatar B1 = new Persegi(10, null, null);
        Persegi P3 = new Persegi(5, null, null);
        BangunDatar B2 = new Lingkaran(7, null, null);
        Lingkaran L2 = new Lingkaran(14, null, null);

        System.out.println("\n=== LAT. ABSTRACT ===");
        System.out.println("Keliling Lingakaran : " + B2.getKeliling());
        System.out.println("Luas Lingkaran      : " + L2.getLuas());
        System.out.println("Keliling Persegi    : " + B1.getKeliling());
        System.out.println("Luas Persegi        : " + P3.getLuas());

        System.out.println("\nisEqualLuas P1 dan P3 : " + P1.isEqualLuas(P3));
        System.out.println("isEqualKeliling L1 dan L2 : " + L1.isEqualKeliling(L2));

        // *** INTERFACE ***

        // pemangggilan method dari IResize
        P3.zoomIn();
        P3.printInfo();

        P3.zoomOut();
        P3.printInfo();

        P3.zoom(50);
        P3.printInfo();

    }
}
