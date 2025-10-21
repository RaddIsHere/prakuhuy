package pertemuan3;

import java.io.*;

public class GayaSentripetal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double m, v, r, Fc;

        System.out.print("Masukkan massa (kg): ");
        m = Double.parseDouble(br.readLine());
        System.out.print("Masukkan kecepatan (m/s): ");
        v = Double.parseDouble(br.readLine());
        System.out.print("Masukkan jari-jari (m): ");
        r = Double.parseDouble(br.readLine());

        Fc = m * (v * v) / r;

        System.out.println("Gaya Sentripetal = " + Fc + " N");
    }
}
