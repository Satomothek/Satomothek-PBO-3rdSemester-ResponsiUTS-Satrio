/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements Loaning, Serializable {
    private Member anggota;
    private List<Book> daftarBuku = new ArrayList<>();

    public Peminjaman(Member anggota) {
        this.anggota = anggota;
    }

    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Peminjaman oleh: " + anggota.getNama());
        for (Book b : daftarBuku) {
            b.tampilInfo();
        }
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku dikembalikan oleh: " + anggota.getNama());
        daftarBuku.clear();
    }
}
