import java.util.HashMap;
import java.util.Map;

/**
 * File : LambdaMap.java
 * Deskripsi : Implementasi lambda pada map
 * Pembuat : 24060124140158 - Nayla Husna
 */

public class LambdaMap {
    public static void main(String[] args) {
        // lambda digunakan untuk membuat map
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124140158", "Nayla");
        mahasiswaMap.put("24060124140159", "Sehun");
        mahasiswaMap.put("24060124140160", "Kai");
        mahasiswaMap.put("24060124140161", "Suho");

        // lambda digunakan untuk menampilkan map
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
    
}
