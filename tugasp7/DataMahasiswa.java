
package tugasp7;

import java.util.Scanner;

class Mahasiswaa {
    String nama, npm, fakultas, kelas;
}

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswaa m = new Mahasiswaa();

        System.out.print("Masukkan Nama: ");
        m.nama = input.nextLine();
        System.out.print("Masukkan NPM: ");
        m.npm = input.nextLine();
        System.out.print("Masukkan Fakultas: ");
        m.fakultas = input.nextLine();
        System.out.print("Masukkan Kelas: ");
        m.kelas = input.nextLine();

        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama     : " + m.nama);
        System.out.println("NPM      : " + m.npm);
        System.out.println("Fakultas : " + m.fakultas);
        System.out.println("Kelas    : " + m.kelas);
    }
}
