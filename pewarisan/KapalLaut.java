package pewarisan;

public class KapalLaut extends Kendaraan {

    public KapalLaut(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    public String informasi() {
        return "Kapal Laut\nNama  : " + nama + "\nJenis : " + jenis;
    }
}
