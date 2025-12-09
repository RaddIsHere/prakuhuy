/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Games extends Produk {
    private int waktuMain;

    // nomor 5
    public Games(String judul, String penulis) {
        super(judul, penulis);
    }

    // nomor 6
    public Games(String judul, String penulis, int waktuMain) {
        super(judul, penulis);
        this.waktuMain = waktuMain;
    }

    @Override
    public String getInfoProduk() {
        return super.getInfoProduk() +
               (waktuMain > 0 ? " | Waktu Main: " + waktuMain + " menit" : "");
    }
}
