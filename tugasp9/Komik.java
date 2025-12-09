/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Komik extends Produk {
    private int jumlahHalaman;

    // nomor 5
    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }

    // nomor 6
    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() +
               (jumlahHalaman > 0 ? " | Halaman: " + jumlahHalaman : "");
    }
}
