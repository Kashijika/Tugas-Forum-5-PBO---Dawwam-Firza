/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Gym {
    private String nama;
    private String lokasi;
    private Equipment[] equipmentList;
    private GymClass[] Kelas;
    private Locker locker;

    public Gym(String name, String address, Equipment[] equipmentList, GymClass[] gymClasses, int kapasitas) {
        this.nama = name;
        this.lokasi = address;
        this.equipmentList = equipmentList;
        this.Kelas = gymClasses;
        this.locker = new Locker(kapasitas);
    }

    public void displayInfo() {
        System.out.println("Gym: " + nama);
        System.out.println("Lokasi : " + lokasi);
        System.out.println("Alat yang tersedia:");
        for (Equipment equipment : equipmentList) {
            System.out.println("- " + equipment.getNamaAlat() + " (Kondisi : " + equipment.getKondisi() + ")");
        }
        System.out.println("");
        System.out.println("Fasilitas VIP");
        System.out.println("Kelas yang tersedia:");
        for (GymClass gymClass : Kelas) {
            gymClass.displayClassInfo();
        }
        System.out.println("");
        System.out.println("- Jumlah Locker:");
        locker.jumlahKapasitas();
    }
    
    public void pesanLocker(Member member) {
        locker.bookLocker(member);
    }
}

