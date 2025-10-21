package pertemuan3;

import java.io.*;

public class BuahSisca {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mangga = 70;
        int jambu = 30 * 4; // 4 tetangga, masing-masing 30 pcs
        int manggaBusuk = 15;

        int totalBuah = (mangga - manggaBusuk) + jambu;

        System.out.println("Total buah yang dibeli Ibu Sisca: " + totalBuah + " buah");
    }
}
