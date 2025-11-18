/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp6;

class Anak extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread anak: " + i);
        }
    }
}

public class Nomor8 {
    public static void main(String[] args) {
        Anak a = new Anak();
        a.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread utama: " + i);
        }
    }
}
