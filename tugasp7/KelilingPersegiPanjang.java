
package tugasp7;

import java.util.Scanner;

public class KelilingPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();

        int keliling = 2 * (p + l);
        System.out.println("Keliling persegi panjang = " + keliling);
    }
}
