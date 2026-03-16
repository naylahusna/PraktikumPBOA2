import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /***** ATRIBUT *****/
    protected String nidn;

    /***** METHOD *****/
    //konstruktor
    public DosenTetap(String nip, String nidn, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas){
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    @Override
    public void printInfo(){
        System.out.println("NIP              : " + nip);
        System.out.println("NIDK             : " + nidn); 
        System.out.println("Nama             : " + nama);
        System.out.println("Tanggal Lahir    : " + tglLahir);
        System.out.println("TMT              : " + tmt);
        System.out.println("Jabatan          : Dosen Tetap");
        System.out.println("Fakultas         : " + fakultas);
        System.out.println("Masa Kerja       : " + getMasaKerja());
        System.out.println("Tanggal Pensiun  : " + Pensiun(65));
        System.out.println("Gaji Pokok       : Rp." + gajiPokok);

        //tunjangan
        Period mk = Period.between(tmt, LocalDate.now());
        double tunjangan = 0.02 * mk.getYears() * gajiPokok;
        System.out.printf("Tunjangan        : 2%% x %d x Rp %.2f = Rp %.2f\n", mk.getYears(), gajiPokok, tunjangan);
    }
}
