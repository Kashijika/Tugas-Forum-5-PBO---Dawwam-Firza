/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Trainer extends Member {
    private String latihan;

    public Trainer(String nama, String ID, String latihan) {
        super(nama, ID);
        this.latihan = latihan;
    }
    
    

    public String getLatihan() {
        return latihan;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + ID);
        System.out.println("Trainer");
        System.out.println("Mengajar kelas " + latihan);
        System.out.println("");
    }
}

