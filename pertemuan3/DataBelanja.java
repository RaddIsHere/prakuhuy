package pertemuan3;

import java.io.*;

public class DataBelanja {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nama;
        double totalBelanja, diskon, total, bayar, kembali;

        System.out.print("Nama Pembeli: ");
        nama = br.readLine();
        System.out.print("Total Belanja: ");
        totalBelanja = Double.parseDouble(br.readLine());
        System.out.print("Diskon (%): ");
        diskon = Double.parseDouble(br.readLine());
        System.out.print("Bayar: ");
        bayar = Double.parseDouble(br.readLine());

        total = totalBelanja - (totalBelanja * diskon / 100);
        kembali = bayar - total;

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(totalBelanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembali);
        dos.close();

        System.out.println("\nData berhasil disimpan ke file belanja.dat\n");

        DataInputStream dis = new DataInputStream(new FileInputStream("belanja.dat"));
        System.out.println("=== Struk Belanja ===");
        System.out.println("Nama     : " + dis.readUTF());
        System.out.println("Belanja  : " + dis.readDouble());
        System.out.println("Diskon   : " + dis.readDouble() + "%");
        System.out.println("Total    : " + dis.readDouble());
        System.out.println("Bayar    : " + dis.readDouble());
        System.out.println("Kembali  : " + dis.readDouble());
        dis.close();
    }
}
