package pertemuan3;

import java.io.*;
import java.util.Scanner;

public class ScannerVsBufferedReader {
    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Input menggunakan Scanner (nama): ");
        String nama1 = sc.nextLine();
        System.out.println("Output Scanner: " + nama1);

        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input menggunakan BufferedReader (nama): ");
        String nama2 = br.readLine();
        System.out.println("Output BufferedReader: " + nama2);

        System.out.println("\nPerbedaan:");
        System.out.println("- Scanner: lebih mudah digunakan, bisa baca int/double langsung.");
        System.out.println("- BufferedReader: lebih cepat dan efisien, tapi perlu parsing manual.");
    }
}
