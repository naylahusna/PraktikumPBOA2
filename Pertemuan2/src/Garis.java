/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat   : Nayla Husna/24060124140158 
 * Tanggal   : 28 Februari 2026
 */

public class Garis {
    // States / Atribut
    private Titik T1;
    private Titik T2;
    private static int counterGaris = 0;

    // Behaviour / Method
    
    // mengembalikan nilai titik
    public static int getCounterGaris(){
        return counterGaris;
    }

    // konstruktor garis tanpa parameter yang menginisialisasi titik awal (0,0) dan titik akhir (1,1)
    public Garis(){
        T1 = new Titik();
        T2 = new Titik(1,1);
        counterGaris++;
    }

    // konstruktor garis dengan parameter masukan titik awal dan titik akhir
    public Garis(Titik T1, Titik T2){
        this.T1 = T1;
        this.T2 = T2;
        counterGaris++;

    }

    // selektor untuk setiap atribut dan mutator
    // mengembalikan nilai T1
    public Titik getTitikAwal(){
        return T1;
    }
    
    // mengembalikan nilai T2
    public Titik getTitikAkhir(){
        return T2;
    }

    // mengubah nilai T1
    public void setTitikAwal(Titik T1){
        this.T1 = T1;
    }

    // mengubah nilai T2
    public void setTitikAkhir(Titik T2){
        this.T2 = T2;
    }

    // menghitung panjang garis
    public double getPanjang(){
        return Math.sqrt(Math.pow(T2.getAbsis() - T1.getAbsis(), 2) + Math.pow(T2.getOrdinat() - T1.getOrdinat(), 2));
    }

    // menghitung gradien garis
    public double getGradien(){
        return (T2.getOrdinat() - T1.getOrdinat()) / (T2.getAbsis() - T1.getAbsis());
    }

    // menembalikan titik tengah garis
    public Titik getMidPoint(){
        double midX = (T1.getAbsis() + T2.getAbsis()) / 2;
        double midY = (T1.getOrdinat() + T2.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // predikat pengecekan garis sejajar
    public boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    // predikat pengecekan garis tegak lurus`
    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    // menampilkan ke layar  k awal dan  k akhir garis
    public void printGaris(){
        System.out.println("Titik Awal: (" + T1.getAbsis() + ", " + T1.getOrdinat() + ") ke Titik Akhir (" + T2.getAbsis() + ", " + T2.getOrdinat() + ")");
    }

    // menampilkan persamaan garus dalam bentuk string y = mx + c
    public void printPersamaanGaris(){
        System.out.println("Persamaan garis: y = " + getGradien() + "x + " + (T1.getOrdinat() - getGradien() * T1.getAbsis()));
    }
}
