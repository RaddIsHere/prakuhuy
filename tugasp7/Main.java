
package tugasp7;

class Mobil {
    String warna = "Merah";

    void jalan() {
        System.out.println("Mobil sedang berjalan...");
    }
}

public class Main {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();  // membuat object
        System.out.println("Warna mobil: " + m1.warna);
        m1.jalan();
    }
}
