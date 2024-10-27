/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class GymClass {
    private String namaKelas;
    private String jadwal;
    private Member trainer;
    private Member[] daftarMember;

    public GymClass(String namaKelas, String jadwal, Member trainer, Member[] daftarMember) {
        this.namaKelas = namaKelas;
        this.jadwal = jadwal;
        this.trainer = trainer;
        this.daftarMember = daftarMember;
    }

    public void displayClassInfo() {
        System.out.println("- " + namaKelas + " dengan trainer " + trainer.getNama() + " setiap hari " + jadwal);
        System.out.println("  Terdaftar:");
        for (Member member : daftarMember) {
            if (member != null)
                System.out.println("  - " + member.getNama() + " (ID: " + member.getID() + ")");
        }
    }
}

