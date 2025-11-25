
package tugasp7;

import java.time.Year;
import java.util.Scanner;

public class TebakTahunLahir {

    static int hitungTahunLahir(int umur) {
        return Year.now().getValue() - umur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur anda: ");
        int umur = sc.nextInt();

        System.out.println("Perkiraan tahun lahir anda : " + hitungTahunLahir(umur));
    }
}

