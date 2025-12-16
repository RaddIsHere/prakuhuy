package pewarisan;

public class Main {
    public static void main(String[] args) {

        // Polimorfisme Bentuk
        Bentuk b1 = new PersegiPanjang(5, 4);
        Bentuk b2 = new BujurSangkar(6);
        Bentuk b3 = new Lingkaran(7);

        System.out.println("Luas Persegi Panjang : " + b1.luas());
        System.out.println("Luas Bujur Sangkar   : " + b2.luas());
        System.out.println("Luas Lingkaran       : " + b3.luas());

        System.out.println();

        // Interface
        Universitas univ = new DataUniversitas();
        univ.tampilData();

        System.out.println();

        // Pewarisan Kendaraan
        Kendaraan m = new Mobil("Avanza", "Darat");
        Kendaraan p = new Pesawat("Boeing", "Udara");
        Kendaraan k = new KapalLaut("Pelni", "Laut");

        System.out.println(m.informasi());
        System.out.println();
        System.out.println(p.informasi());
        System.out.println();
        System.out.println(k.informasi());
    }
}
