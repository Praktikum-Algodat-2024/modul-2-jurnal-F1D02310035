public class Peminjam {
    public Peminjam next;
    public String nama, kartu;
    public int antrian;
    public int jumlah=0;

    Peminjam(String nama, String kartu){
        this.nama=nama;
        this.kartu=kartu;
    }

    Stack stack = new Stack();
}
