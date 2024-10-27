/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Equipment {
    private String namaAlat;
    private String kondisi;

    public Equipment(String equipmentName, String kondisi) {
        this.namaAlat = equipmentName;
        this.kondisi = kondisi;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public String getKondisi() {
        return kondisi;
    }
}

