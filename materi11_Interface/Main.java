/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materi11_Interface;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        
        Phone RealmeC51 = new Xiaomi();
        
        PhoneUser caning = new PhoneUser(RealmeC51);
        
        caning.turnOnThephone();
        
        Scanner input = new Scanner (System.in);
        String aksi = null;
        
        while(true){
            System.out.println("=====APLIKASI INTERFACE=====");
            System.out.println("[1] Nyalakan Hp");
            System.out.println("[2] Matikan Hp");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            aksi=input.nextLine();
            if(aksi.equals("1")){
                caning.turnOnThephone();
            }
            else if(aksi.equals("2")){
                caning.turnOffThePhone();
            }
            else if(aksi.equals("3")){
                caning.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                caning.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("Salah woy");
            }
        }
    }
}
