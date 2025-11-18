/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp6;

/**
 *
 * @author HYPE AMD
 */
public class Nomor5 {
    public static void main(String[] args) {

        int[][] m = {
            {90, 80},
            {100, 50}
        };

        for (int col = 0; col < m[0].length; col++) {
            int t = 0;
            for (int[] m1 : m) {
                t += m1[col];
            }
            System.out.println("Rata kolom " + col + " = " + (t / m.length));
        }
    }
}
