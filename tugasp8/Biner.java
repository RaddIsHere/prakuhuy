/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class Biner {

    public String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        Biner b = new Biner();
        System.out.println("10 dalam biner = " + b.toBinary(10));
    }
}
