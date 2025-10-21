package pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GajiPegawai {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nik, nama, alamat, jabatan;
        double gajiPokok, tJabatan, tIstri, tAnak, totalGaji, pajak, gajiBersih;
        
        System.out.print("Nomor Induk Karyawan (NIK): ");
        nik = br.readLine();
        System.out.print("Nama Karyawan: ");
        nama = br.readLine();
        System.out.print("Alamat: ");
        alamat = br.readLine();
        System.out.print("Jabatan: ");
        jabatan = br.readLine();
        
        System.out.print("Gaji Pokok: ");
        gajiPokok = Double.parseDouble(br.readLine());
        System.out.print("Tunjangan Jabatan: ");
        tJabatan = Double.parseDouble(br.readLine());
        System.out.print("Tunjangan Istri: ");
        tIstri = Double.parseDouble(br.readLine());
        System.out.print("Tunjangan Anak: ");
        tAnak = Double.parseDouble(br.readLine());
        
        totalGaji = gajiPokok + tJabatan + tIstri + tAnak;
        pajak = 0.10 * totalGaji;
        gajiBersih = totalGaji - pajak;
        
        System.out.println("\n=== Data Gaji Pegawai ===");
        System.out.println("NIK             : " + nik);
        System.out.println("Nama Karyawan   : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jabatan         : " + jabatan);
        System.out.println("Total Gaji      : " + totalGaji);
        System.out.println("Pajak (10%)     : " + pajak);
        System.out.println("Gaji Bersih     : " + gajiBersih);
    }
}
