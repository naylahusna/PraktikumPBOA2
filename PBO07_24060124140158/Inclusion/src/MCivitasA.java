public class MCivitasA {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("Khadijah, S.Kom., M.Cs.", "12345");
        Dosen d2 = new Dosen("Edy SUharto, S.T., M.Kom.", "67890");

        Mahasiswaa m1 = new Mahasiswaa("Nayla Husna", "24060124140158");
        Mahasiswaa m2 = new Mahasiswaa("Khanza Qaila", "24060124120011");
        Mahasiswaa m3 = new Mahasiswaa("Khairatu Husna", "24060124140159");
        Mahasiswaa m4 = new Mahasiswaa("Hafidh Zufar", "24060124140164");
        Mahasiswaa m5 = new Mahasiswaa("Novelya Cherina", "24060124140174");

        m1.setWali(d1);
        m2.setWali(d2);
        m3.setWali(d1);
        m4.setWali(d2);
        m5.setWali(d1);

        Seminar seminarPBO = new Seminar();

        seminarPBO.registrasi(d1);
        seminarPBO.registrasi(d2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        seminarPBO.tampilPeserta();
        System.out.println("\nTotal Peserta: " + seminarPBO.countPeserta());
        System.out.println("Total Mahasiswa: " + seminarPBO.countMahasiswa());
        
        System.out.println("\n--- Data Mahasiswa ---");
        m1.printInfoMhs();
        m2.printInfoMhs();
        m3.printInfoMhs();
        m4.printInfoMhs();
        m5.printInfoMhs();
    }
}
