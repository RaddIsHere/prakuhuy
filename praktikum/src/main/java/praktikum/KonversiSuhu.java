package praktikum;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10, F = 15, R = 5;

        double CF = (C * 9/5) + 32;
        double FC = (F - 32) * 5/9;
        double CR = C * 4/5;
        double RC = R * 5/4;
        double FR = (F - 32) * 4/9;
        double RF = (R * 9/4) + 32;

        System.out.println("C ke F = " + CF);
        System.out.println("F ke C = " + FC);
        System.out.println("C ke R = " + CR);
        System.out.println("R ke C = " + RC);
        System.out.println("F ke R = " + FR);
        System.out.println("R ke F = " + RF);
    }
}
