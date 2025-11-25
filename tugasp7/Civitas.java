
package tugasp7;

class Dosen {
    String nama = "Pak Budi";
}
class Mahasiswa {
    String nama = "Radhia Majdi";
}
class Staff {
    String nama = "Pak Andi";
}

public class Civitas {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        Staff s = new Staff();

        System.out.println("Data Civitas Akademika Fakultas Teknik:");
        System.out.println("Dosen: " + d.nama);
        System.out.println("Mahasiswa: " + m.nama);
        System.out.println("Staff: " + s.nama);
    }
}
