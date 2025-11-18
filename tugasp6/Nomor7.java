/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp6;

/**
 *
 * @author HYPE AMD
 */
public class Nomor7 {

    // inner class Mahasiswa
    class Mahasiswa {
        String nama;
        int nilai;

        Mahasiswa(String nama, int nilai) {
            this.nama = nama;
            this.nilai = nilai;
        }

        String getStatus() {
            return nilai >= 70 ? "Lulus" : "Tidak Lulus";
        }
    }

    // inner class Thread anak
    class Proses extends Thread {
        Mahasiswa mhs;

        Proses(Mahasiswa mhs) {
            this.mhs = mhs;
        }

        @Override
        public void run() {
            System.out.println("Nama   : " + mhs.nama);
            System.out.println("Nilai  : " + mhs.nilai);
            System.out.println("Status : " + mhs.getStatus());
        }
    }

    // main
    public static void main(String[] args) {

        Nomor7 app = new Nomor7();

        Mahasiswa m = app.new Mahasiswa("Rafi", 80);

        Proses p = app.new Proses(m);

        p.start(); // memulai thread anak
    }
}
