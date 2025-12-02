/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp8;

public class RataRata {

    int[] nilai;

    public RataRata(int[] nilai) {
        this.nilai = nilai;
    }

    public double hitungRata() {
        int total = 0;
        for (int n : nilai) total += n;
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        int[] data = {80, 90, 75, 95};
        RataRata r = new RataRata(data);
        System.out.println("Rata-rata = " + r.hitungRata());
    }
}
