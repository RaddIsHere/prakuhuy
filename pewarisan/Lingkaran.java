package pewarisan;

public class Lingkaran extends Bentuk {
    private double r;

    public Lingkaran(double r) {
        super("Lingkaran");
        this.r = r;
    }

    @Override
    public double luas() {
        return Math.PI * r * r;
    }
}
