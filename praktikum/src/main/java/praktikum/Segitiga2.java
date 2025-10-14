package praktikum;

public class Segitiga2 {
    public static void main(String[] args) {
        double a = 6, b = 8;
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("Sisi miring (c) = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}
