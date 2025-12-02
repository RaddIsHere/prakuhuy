/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class Kasir {

    double harga;
    int jumlah;
    double diskon;

    // Jika hanya harga
    public Kasir(double harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    // Jika harga + jumlah
    public Kasir(double harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    // Jika lengkap
    public Kasir(double harga, int jumlah, double diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public double totalBayar() {
        double total = harga * jumlah;
        total -= total * (diskon / 100);
        return total;
    }

    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000, 3, 10);
        System.out.println("Total bayar = " + k1.totalBayar());
    }
}
