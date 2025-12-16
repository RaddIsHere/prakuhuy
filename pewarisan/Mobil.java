package pewarisan;

public class Mobil extends Kendaraan {

    public Mobil(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    public String informasi() {
        return "Mobil\nNama  : " + nama + "\nJenis : " + jenis;
    }
}
