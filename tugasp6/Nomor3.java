/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp6;

public class Nomor3 {
    public static void main(String[] args) {

        int[] data = {4, 7, 2, 9, 1};

        // a. jumlah elemen
        System.out.println("Jumlah elemen: " + data.length);

        // b. terbesar & terkecil
        int max = data[0], min = data[0];
        for (int d : data) {
            if (d > max) max = d;
            if (d < min) min = d;
        }
        System.out.println("Max: " + max + ", Min: " + min);

        // c. cari index angka 9
        int cari = 9;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == cari) System.out.println("Index angka 9: " + i);
        }

        // d. rata-rata
        int total = 0;
        for (int d : data) total += d;
        System.out.println("Rata-rata: " + (double) total / data.length);

        // e. jumlah elemen genap
        int jumlahGenap = 0;
        for (int d : data) if (d % 2 == 0) jumlahGenap++;
        System.out.println("Jumlah genap: " + jumlahGenap);

        // f. cek ganjil/genap
        int x = 7;
        System.out.println(x % 2 == 0 ? "Genap" : "Ganjil");
    }
}
