package pewarisan;

public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi) {
        super("Bujur Sangkar");
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
