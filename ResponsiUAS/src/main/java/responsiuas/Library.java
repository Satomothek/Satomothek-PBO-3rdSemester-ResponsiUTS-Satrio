/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Member> anggotaList = new ArrayList<>();

    public void tambahAnggota(Member a) {
        anggotaList.add(a);
    }

    public void simpanData(String fileName) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(anggotaList);
            System.out.println("Data berhasil disimpan");
        } catch (IOException e) {
            System.out.println("Error menyimpan data: " + e.getMessage());
        }
    }

    public void bacaData(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            anggotaList = (List<Member>) in.readObject();
            System.out.println("Data berhasil dibaca");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error membaca data: " + e.getMessage());
        }
    }
}
