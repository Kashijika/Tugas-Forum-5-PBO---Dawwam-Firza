/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Locker {
    private int kapasitas;
    private Member member;

    public Locker(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    public void bookLocker(Member member) {
        this.member = member;
        System.out.println(member.getNama() + " telah membooking locker");
    }
    
    public void jumlahKapasitas(){
        System.out.println("  - Gym ini memiliki kapasitas locker " + kapasitas);
    }
}



