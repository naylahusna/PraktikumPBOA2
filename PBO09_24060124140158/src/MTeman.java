/* Nama file : MTeman.java
   Deskripsi : Kelas yang berisi aplikasi dari kelas teman
   Pembuat : Nayla Husna/24060124140158
   Tanggal : 4 Mei 2026 */

public class MTeman {
    public static void main(String[] args) {
        Teman<String> T = new Teman<>(); 

        T.addNama("Nayla");
        T.addNama("Khanza");
        T.addNama("Ratu");
        T.addNama("Husna");
        T.showTeman();

        // menampilkan jumlah teman
        System.out.println("Jumlah teman : " + T.getNbElm());

        // memeriksa apakah 'Khanza' adalah te,an
        System.out.println("Apakah Khanza teman saya? " + T.isMember("Khanza"));

        // menghitung kemunculan nama teman
        System.out.println("Nama Nayla ada : " + T.countNama("Nayla"));

        // menghapus nama teman
        System.out.println("Jumlah teman saat ini : " + T.getNbElm());
        T.delNama("Khanza");
        T.showTeman();
        System.out.println("Jumlah teman setelah dihapus : " + T.getNbElm());

        // mengganti nama teman
        T.gantiNama("Ratu", "Khairatu Husna");
        T.showTeman();


    }
}