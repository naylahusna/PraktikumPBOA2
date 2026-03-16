/* Nama File   : Titik.java 
 * Deskripsi   : berisi atribut dan method dalam class titik
 * Pembuat     : Nayla Husna/24060124140158 
 * Tanggal     : 23 Februari 2026
 */


public class Titik {
    //***********ATRIBUT**************
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    //***********METHOD**************
    //konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    public Titik(){
        this(0,0); //memanggil konstruktor dengan parameter untuk membuat titik (0,0)
    }

    // konstruktor overloading
    // Titik(double x, double y) {
    //     absis = x;
    //     ordinat = y;
    //     counterTitik++;
    // }

    public Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    public void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public int getKuadran(){
        if (absis > 0 && ordinat > 0)
            return 1;
        else if (absis < 0 && ordinat > 0)
            return 2;
        else if (absis < 0 && ordinat < 0)
            return 3;
        else if (absis > 0 && ordinat < 0)
            return 4;
        else
            return 0;
    }

    //getJarakPusat
    public double getJarakPusat() {
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    //getJarak
    public double getJarak(Titik T) {
        double selisihX = this.absis - T.getAbsis();
        double selisihY = this.ordinat - T.getOrdinat();

        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    //refleksiX
    public void refleksiX() {
        ordinat = ordinat * -1 ;
    }

    //refleksiY
    public void refleksiY() {
        absis = absis * -1 ;
    }

    //getRefleksiX
    public Titik getRefleksiX() {
        return new Titik(absis, ordinat * -1) ;
    }

    //getRefleksiY
    public Titik getRefleksiY() {
        return new Titik(absis * -1, ordinat) ;
    }
    
} //end class Titik


