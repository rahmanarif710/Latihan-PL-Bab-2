package latihanplbab2;
//nama    = Arif Rahman
//NIM     = 155150200111101
//kelas   = Informatika - H

import java.util.Scanner;

public class Mahasiswa {

    private String nama, nim;
    private double waktu, putaran;
    Scanner in = new Scanner(System.in);
    Lapangan lari = new Lapangan(100,20);

    public Mahasiswa() {
        this.nim = in.next();
        this.nama = in.next();
        this.putaran = in.nextInt();
        this.waktu = in.nextInt();
    }

    public int hitungJarak() {
        return lari.keliling() * (int) putaran;
    }

    public double hitungWaktu() {
        return putaran / waktu;
    }

    public String getNama() {
        return nama;
    }

    public void displayMessage() {
        System.out.println(nama + " " + hitungJarak());
    }
}
