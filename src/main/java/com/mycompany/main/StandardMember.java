/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class StandardMember extends Member {
    public StandardMember(String nama, String ID) {
        super(nama, ID);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("ID: " + ID);
        System.out.println("Member biasa");
        System.out.println("");
    }
}

