/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Produk {
    protected String judul;
    protected String penulis;

    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getInfoProduk() {
        return "Judul: " + judul + " | Penulis: " + penulis;
    }
}
