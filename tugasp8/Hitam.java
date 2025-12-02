/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class Hitam {

    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public int luasHitam(Hitam h, int pBesar, int lBesar, int pKecil, int lKecil) {
        return h.hitungLuas(pBesar, lBesar) - h.hitungLuas(pKecil, lKecil);
    }

    public static void main(String[] args) {
        Hitam h = new Hitam();

        int luas = h.luasHitam(h, 10, 5, 8, 4);
        System.out.println("Luas bidang hitam = " + luas);
    }
}
