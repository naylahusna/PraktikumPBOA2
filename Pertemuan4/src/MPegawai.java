import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args){
        DosenTetap Dosen1 = new DosenTetap("9545647548", "78647324",  "Andi",  LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.0, "Fakultas Sains dan Matematika");
        DosenTamu DTamu1 = new DosenTamu("9545647001", "88847321", "Dini", LocalDate.of(1995, 8, 10), LocalDate.of(2024, 2, 1), 4000000.0, "Fakultas Teknik", LocalDate.of(2025, 12, 1));
        Tendik T1 = new Tendik("9545647999", "Nian", LocalDate.of(1985, 1, 20), LocalDate.of(2010, 6, 15), 3500000.0, "Akademik");

        System.out.println("=== DATA DOSEN TETAP ===");
        Dosen1.printInfo();
        System.out.println("\n=== DATA DOSEN TAMU ===");
        DTamu1.printInfo();
        System.out.println("\n=== DATA TENDIK ===");
        T1.printInfo();
    }
}
