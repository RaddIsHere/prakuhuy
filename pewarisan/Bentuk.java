package pewarisan;

public abstract class Bentuk {
    protected String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public abstract double luas();
}
