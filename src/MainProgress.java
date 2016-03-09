package latihanplbab2;

//nama    = Arif Rahman
//NIM     = 155150200111101
//kelas   = Informatika - H
public class MainProgress {

    public static void main(String[] args) {
        Mahasiswa A = new Mahasiswa();
        Mahasiswa B = new Mahasiswa();
        Mahasiswa C = new Mahasiswa();
        System.out.println();
        A.displayMessage();
        B.displayMessage();
        C.displayMessage();
        if (A.hitungWaktu() > B.hitungWaktu() && A.hitungWaktu() > C.hitungWaktu()) {
            System.out.println("Tercepat = " + A.getNama());
        } else if (B.hitungWaktu() > A.hitungWaktu() && B.hitungWaktu() > C.hitungWaktu()) {
            System.out.println("Tercepat = " + B.getNama());
        } else if (C.hitungWaktu() > A.hitungWaktu() && C.hitungWaktu() > B.hitungWaktu()) {
            System.out.println("Tercepat = " + C.getNama());
        }
    }
}
