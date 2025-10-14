package praktikum;

public class WaktuTempuh {
    public static void main(String[] args) {
        double jarakBulan = 384400;      // km
        double jarakMatahari = 152100000; // km
        double c = 300000; // km/s

        double waktuBulan = jarakBulan / c;
        double waktuMatahari = jarakMatahari / c;

        System.out.println("Waktu tempuh cahaya ke Bulan = " + waktuBulan + " detik");
        System.out.println("Waktu tempuh cahaya ke Matahari = " + waktuMatahari + " detik");
    }
}
