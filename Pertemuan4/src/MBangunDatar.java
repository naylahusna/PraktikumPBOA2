/* Nama File : MBangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 9 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi();
        P1.setSisi(5);

        System.out.println("PERSEGI");
        P1.printInfo();
        System.out.println("Luas Persegi     : " + P1.getLuas());
        System.out.println("Keliling Persegi : " + P1.getKeliling());
        System.out.println("Diagonal Persegi : " + P1.getDiagonal());

        Lingkaran L1 = new Lingkaran();
        L1.setJari(4);

        System.out.println("\nLINGKARAN");
        L1.printInfo();
        System.out.println("Keliling Lingkaran : " + L1.getKeliling());
        System.out.println("Luas Lingkaran : " + L1.getLuas());

    }
}
