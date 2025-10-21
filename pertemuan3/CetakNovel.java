package pertemuan3;

import java.io.*;

public class CetakNovel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah novel yang dicetak: ");
        int novel = Integer.parseInt(br.readLine());
        System.out.print("Masukkan tebal (lembar) per novel: ");
        int lembar = Integer.parseInt(br.readLine());

        int totalLembar = novel * lembar;
        int totalDetik = totalLembar; // karena 1 lembar = 1 detik

        int hari = totalDetik / 86400;
        int sisaHari = totalDetik % 86400;
        int jam = sisaHari / 3600;
        int sisaJam = sisaHari % 3600;
        int menit = sisaJam / 60;
        int detik = sisaJam % 60;

        System.out.println("\n=== Waktu Pencetakan Novel ===");
        System.out.println("Total Lembar  : " + totalLembar);
        System.out.println("Total Waktu   : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
