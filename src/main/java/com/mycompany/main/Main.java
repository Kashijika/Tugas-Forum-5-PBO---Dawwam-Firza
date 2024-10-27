/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author ferna
 */
public class Main {
    public static void main(String[] args) {
        Equipment[] equipmentList = new Equipment[2];
        equipmentList[0] = new Equipment("Treadmill", "Perlu servis");
        equipmentList[1] = new Equipment("Dumbbell Set", "Bagus");


        Member[] member = new Member[2];
        member[0] = new StandardMember("Dawwam", "M001");
        member[1] = new StandardMember("Firza", "M002");

        Member[] memberVIP = new Member[2];
        memberVIP[0] = new VIPMember("Mawardi", "MV001");
        memberVIP[1] = new VIPMember("Fernanda", "MV002");

        Member trainer1 = new Trainer("Mutahari", "T001", "Yoga");
        Member trainer2 = new Trainer("Shakti", "T002", "Boxing");
        
        Member[] kelas1 = new VIPMember[1];
        kelas1[0] = memberVIP[0];
        
        Member[] kelas2 = new VIPMember[2];
        kelas2[0] = memberVIP[0];
        kelas2[1] = memberVIP[1];


        GymClass[] gymClasses = new GymClass[2];
        gymClasses[0] = new GymClass("Kelas Yoga", "Senin jam 10:00", trainer1, kelas1);
        gymClasses[1] = new GymClass("Kelas Boxing", "Sabtu jam 15:00", trainer2, kelas2);

        Gym gym = new Gym("2in Bugar!!!", "Buahatu", equipmentList, gymClasses, 10);
        

        gym.displayInfo();
        member[0].displayInfo();
        member[1].displayInfo();
        memberVIP[0].displayInfo();
        memberVIP[1].displayInfo();
        trainer1.displayInfo();
        trainer2.displayInfo();
        System.out.println("Booking Locker:");
        gym.pesanLocker(member[0]);
        gym.pesanLocker(memberVIP[1]);
        
        
    }
}

