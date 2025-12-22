/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuas;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String nama;

    public Member(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}
