/* Nama File   : Piaraan.java
 * Deskripsi   : Kelas untuk mengelola kumpulan hewan dalam piaraan
 * Pembuat     : Nayla Husna/24060124140158
 * Tanggal     : 4 Mei 2026 */

import java.util.Queue;
import java.util.LinkedList;

public class Piaraan {
    // Atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Method
    // konstruktor tanpa parameter
    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    // konstruktor dengan parameter
    public Piaraan(int nbelm, Queue<Anabul> Lanabul) {
        this.Lanabul = new LinkedList<>();
        this.nbelm = nbelm;
    }

    // menghitung banyak elemen
    public int getNbElm() {
        return this.nbelm;
    }

    // menambahkan elemen terakhir
    public void enqueue(Anabul anabul) {
        this.Lanabul.add(anabul);
        this.nbelm++;
    }

    // memeriksa apakah termasuk anggota
    public boolean isMember(Anabul anabul) {
        return this.Lanabul.contains(anabul);
    }

    // mengambil data anabul pertama dalam antrian
    public Anabul getAnabul() {
        return this.Lanabul.peek();
    }

    // mengambil anabul pertama serta mengeluarkannya dari antrian
    public Anabul dequeue() {
        if (!this.Lanabul.isEmpty()) {
            this.nbelm--;
            return this.Lanabul.poll();
        }
        return null;
    }

    // menampilkan nama-nama panggilan anabul dalam antian
    public void showAnabul() {
        System.out.print("Daftar Nama Anabul : ");
        for (Anabul a : this.Lanabul) {
            System.out.print(a.getNama() + " ");
        }
        System.out.println();
    }

    // menghitung banyak keluarga kucing dalam antrian
    public int countKucing(){
        int count = 0;
        for (Anabul a : this.Lanabul){
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // menghitung bobot keluarga kucing dalam antrian
    public double totalBobotKucing(){
        double totalBobot = 0.0;
        for (Anabul a : this.Lanabul){
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    // menampilkan nama-nama panggilan para anabul berserta jenis objeknya
    public void showJenisAnabul(){
        System.out.println("Daftar Jenis Anabul dalam Antrian: ");
        for (Anabul a : Lanabul){
            System.out.println("- " + a.getNama() + " berjenis " + a.getClass().getName());
        }
    }
}
