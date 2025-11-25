
package tugasp7;

import java.util.Scanner;

public class HitungHari {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan (1-12): ");
        int bulan = sc.nextInt();
        System.out.print("Masukkan tanggal: ");
        int tgl = sc.nextInt();

        int jumlah;
        if (bulan == 1) {
            jumlah = tgl;
        } else {
            jumlah = 0; // contoh sederhana sesuai instruksi
        }

        System.out.println("Jumlah hari = " + jumlah);
    }
}
