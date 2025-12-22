package com.mycompany.responsiuas;

public class Main {
    public static void main(String[] args) {

        // Agregasi
        Library perpustakaan = new Library();
        Member a1 = new Member("A01", "Budi");
        perpustakaan.tambahAnggota(a1);

        // Book
        Book b1 = new Book("B01", "Pemrograman Java", "Charlo");
        Book b2 = new Book("B02", "OOP Lanjut", "Bonita");
        Book b3 = new Book("BO3", "Algoritma Pemrograman", "Dewa");

        // Komposisi
        Peminjaman p = new Peminjaman(a1);
        p.tambahBuku(b1);
        p.tambahBuku(b2);

        // Interface
        p.pinjam();
        p.kembalikan();

        // File I/O
        perpustakaan.simpanData("dataperpustakaan.dat");
        perpustakaan.bacaData("dataperpustakaan.dat");
    }
}
