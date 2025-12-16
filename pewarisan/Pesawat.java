package pewarisan;

public class Pesawat extends Kendaraan {

    public Pesawat(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    @Override
    public String informasi() {
        return "Pesawat\nNama  : " + nama + "\nJenis : " + jenis;
    }
}
