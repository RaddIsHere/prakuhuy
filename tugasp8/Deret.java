/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class Deret {

    public void tampil(int[] deret) {
        for (int d : deret) {
            System.out.print(d + " ");
        }
    }

    public static void main(String[] args) {
        int[] angka = {6, 12, 24, 48, 96};

        Deret d = new Deret();
        d.tampil(angka); // pass array by reference
    }
}
