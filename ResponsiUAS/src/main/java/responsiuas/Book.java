/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

public class Book extends LibraryCollection {
    private String penulis;

    public Book(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Buku: " + judul + " | Penulis: " + penulis);
    }
}