package pertemuan3;

import java.io.*;

public class SelisihWaktu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan waktu pertama (jam): ");
        int jam1 = Integer.parseInt(br.readLine());
        System.out.print("Masukkan waktu kedua (jam): ");
        int jam2 = Integer.parseInt(br.readLine());

        int selisih = Math.abs(jam2 - jam1);
        System.out.println("Selisih waktu: " + selisih + " jam");
    }
}
