/* Nama File : MGaris.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 28 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(2, 5);
        Titik t3 = new Titik(3, 2);
        Titik t4 = new Titik(2, 4);

        Garis g1 = new Garis(t1, t2); 
        Garis g2 = new Garis(t3, t4); 

        System.out.println("= Garis 1 =");
        g1.printGaris();
        System.out.println("Panjang garis pertama: " + g1.getPanjang());
        System.out.println("Gradien garis pertama: " + g1.getGradien());
        System.out.println("Titik tengah garis pertama: (" + g1.getMidPoint().getAbsis() + ", " + g1.getMidPoint().getOrdinat() + ")");
        g1.printPersamaanGaris();

        System.out.println("\n= Garis 2 =");
        g2.printGaris();
        System.out.println("Panjang garis kedua: " + g2.getPanjang());
        System.out.println("Gradien garis kedua: " + g2.getGradien());
        System.out.println("Titik tengah garis kedua: (" + g2.getMidPoint().getAbsis() + ", " + g2.getMidPoint().getOrdinat() + ")");
        g2.printPersamaanGaris();

        System.out.println("\n= Hubungan Garis 1 dan Garis 2 =");
        System.out.println("Apakah garis pertama sejajar dengan garis kedua? " + g1.isSejajar(g2));
        System.out.println("Apakah garis pertama tegak lurus dengan garis kedua? " + g1.isTegakLurus(g2));

        System.out.println("\nTotal jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}
