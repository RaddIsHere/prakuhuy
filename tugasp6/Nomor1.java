
package tugasp6;

public class Nomor1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[]{4, 5, 6};
        int[] c = new int[3];

        System.out.println("Array 1: ");
        for (int x : a) System.out.print(x + " ");

        System.out.println("\nArray 2: ");
        for (int x : b) System.out.print(x + " ");

        System.out.println("\nArray 3: ");
        for (int x : c) System.out.print(x + " ");
    }
}

