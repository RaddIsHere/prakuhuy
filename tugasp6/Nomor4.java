/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp6;

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int n = s.nextInt();

        String[] nama = new String[n];
        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = s.next();
            System.out.print("Nilai: ");
            nilai[i] = s.nextInt();
        }

        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < n; i++) {
            String status = nilai[i] >= 70 ? "Lulus" : "Tidak Lulus";
            System.out.println(nama[i] + " - " + nilai[i] + " - " + status);
        }
    }
}
