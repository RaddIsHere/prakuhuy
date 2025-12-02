/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class Perpangkatan {

    public int pangkat(int bil, int p) {
        int hasil = 1;
        for (int i = 1; i <= p; i++) {
            hasil *= bil;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Perpangkatan p = new Perpangkatan();
        System.out.println("2^5 = " + p.pangkat(2, 5));
    }
}
