/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Member {
    protected String nama;
    protected String ID;

    public Member(String nama, String ID) {
        this.nama = nama;
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return ID;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + ID);
        System.out.println("");
    }
}

