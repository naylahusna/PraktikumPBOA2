public class Kucing extends Anabul {
    protected double bobot;

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi 'meow'");
    }   

    public String toString() {
        return "Kucing: " + nama + ", Bobot: " + bobot + " kg";
    }
}
