public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }
    
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }       

    @Override
    public void suara() {           
        System.out.println(nama + " berbunyi 'meow meow'");
    }
}
