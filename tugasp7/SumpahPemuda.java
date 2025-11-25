
package tugasp7;
public class SumpahPemuda {

    static void tampilkan(int n) {
        if (n == 0) return;
        System.out.println("Kami putra dan putri Indonesia, mengaku bertumpah darah yang satu, tanah air Indonesia.");
        tampilkan(n - 1);
    }

    public static void main(String[] args) {
        tampilkan(3); // ditampilkan 3x
    }
}

