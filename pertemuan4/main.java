/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author USER
 */
public class main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        monster.attack();
        Zombie zumbi = new Zombie();
        zumbi.attack();
        pocong hantupocong = new pocong();
        hantupocong.attack();
        Burung garuda = new Burung();
        garuda.attack();
    }
}
