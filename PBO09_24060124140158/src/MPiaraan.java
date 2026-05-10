/* Nama File   : MPiaraan.java
 * Deskripsi   : Kelas yang berisi aplikasi dari kelas piaraan
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan P = new Piaraan();

        Kucing k1 = new Kucing("Lili Vivi", "Livi", 3.5);
        Kucing k2 = new Kucing("Micky Aladin","Micky", 5.0);
        Anjing a1 = new Anjing("Roberton","Rober");

        // menambah ke antrian
        P.enqueue(a1);
        P.enqueue(k1);
        P.enqueue(k2);

        // menampilkan data
        P.showAnabul();
        P.showJenisAnabul();

        System.out.println("Jumlah Kucing : " + P.countKucing());
        System.out.println("Total Bobot Kucing : " + P.totalBobotKucing());

        // dequeue anabul
        Anabul anabulKeluar = P.dequeue();
        System.out.println("Anabul yang keluar: " + anabulKeluar.getNama());

        System.out.println("Sisa antrian anabul: " + P.getNbElm());
        P.countKucing();
    }
}

// koleksi itu ukurannya fleksibel, bisa bertambah atau berkurang otomatis sesuai data yang dimasukiin
// ada list, set, dan queue, dll
// koleksi itu bisa dari beberapa objek berbeda tapi masih dalam satu tipe data sama, misal koleksi anabul diisi anaknya annjing kucing dan burung

