/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi_PBO_UTS_2440506063;

/**
 *
 * @author Satomo
 */
public class PegawaiKontrak extends Pegawai {
    private String lamaKontrak;

    public PegawaiKontrak(String namaPegawai, double gaji, String lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public String getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(String lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak);
    }
}

