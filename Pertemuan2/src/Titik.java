/* Nama File   : Titik.java 
 * Deskripsi   : berisi atribut dan method dalam class titik
 * Pembuat     : Nayla Husna/24060124140158 
 * Tanggal     : 23 Februari 2026
 */


public class Titik {
    //***********ATRIBUT**************
    double absis;
    double ordinat;
    static int counterTitik = 0;

    //***********METHOD**************
    //konstruktor untuk membuat titik (0,0)
    // Titik(){
    //     absis = 0;
    //     ordinat = 0;
    //     counterTitik++;
    // }

    Titik(){
        this(0,0); //memanggil konstruktor dengan parameter untuk membuat titik (0,0)
    }

    // konstruktor overloading
    // Titik(double x, double y) {
    //     absis = x;
    //     ordinat = y;
    //     counterTitik++;
    // }

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }
    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    int getKuadran(){
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

    int getJarakPusat(){
        return (int) Math.sqrt(absis*absis + ordinat*ordinat);
    }

    
} //end class Titik


