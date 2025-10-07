/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO_UTS_2440506063;

/**
 *
 * @author Satomo
 */
public class Main {
    public static void main(String[] args) {
        // Output Produk
        System.out.println("1. Output Produk:");
        Elektronik produk1 = new Elektronik("Laptop", 15000000, 2);
        produk1.tampilkanInfo();
        System.out.println();

        // Output Pegawai
        System.out.println("2. Output Pegawai:");
        PegawaiTetap pegawai1 = new PegawaiTetap("Satrio", 5000000, 1000000);
        pegawai1.tampilkanInfo();
        System.out.println();

        // Output Polimorfisme
        System.out.println("3. Output Polimorfisme:");
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        produk2.tampilkanInfo();
        System.out.println();

        Pegawai pegawai2 = new PegawaiKontrak("Satrio", 3000000, "12 bulan");
        pegawai2.tampilkanInfo();
    }
}
