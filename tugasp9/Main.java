/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== NOMOR 1 =====");
        ContohHewan h = new ContohHewan();
        h.jenisHewan();
        h.tampilContoh();

        System.out.println("\n===== NOMOR 2 =====");
        MainSegitiga seg = new MainSegitiga(10, 5);
        System.out.println("Luas segitiga = " + seg.hitungLuas());

        System.out.println("\n===== NOMOR 3 =====");
        Kubus kubus = new Kubus(5);
        System.out.println("Volume kubus = " + kubus.getVolume());

        System.out.println("\n===== NOMOR 4 =====");
        Kucing k = new Kucing("Milo");
        System.out.println(k.makan());
        System.out.println(k.display());

        System.out.println("\n===== NOMOR 5 =====");
        Komik komik = new Komik("Naruto", "Masashi Kishimoto");
        Games game = new Games("GTA V", "Rockstar");
        System.out.println(komik.getInfoProduk());
        System.out.println(game.getInfoProduk());

        System.out.println("\n===== NOMOR 6 =====");
        Komik komik2 = new Komik("One Piece", "Oda", 1200);
        Games game2 = new Games("PES 2025", "Konami", 90);
        System.out.println(komik2.getInfoProduk());
        System.out.println(game2.getInfoProduk());
    }
}
