/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author HP 745 G5
 */
public class pacManMain {
    public static void main(String[] args){
        pacMan pacman = new pacMan(2, 3, 5, 4);

        pacman.moveRight();
        pacman.moveUp();

        pacman.printPosition();
    }
    
}
