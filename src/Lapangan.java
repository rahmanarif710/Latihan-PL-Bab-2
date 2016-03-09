package latihanplbab2;
//nama    = Arif Rahman
//NIM     = 155150200111101
//kelas   = Informatika - H

import java.util.Scanner;

public class Lapangan {

    private int panjang, lebar;
    Scanner in = new Scanner(System.in);

    public Lapangan(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }

    public int keliling() {
        return 2 * (this.panjang + this.lebar);
    }
}
