/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;

/**
 *
 * @author HP 745 G5
 */
import java.util.Scanner;
public class PersegiPanjangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
       Scanner sc = new Scanner(System.in);
       
       for(int i = 0; i < 3; i++){
           ppArray[i] = new PersegiPanjang();
           System.out.println("persegi panjang ke-"+ i);
           System.out.print("masukkan panjang: ");
           ppArray[i].panjang = sc.nextInt();
           System.out.print("masukkan lebar: ");
           ppArray[i].lebar = sc.nextInt();
       }
       
       for(int i = 0; i < 3; i++){
           System.out.println("persegi panjang ke-"+ i);
           System.out.println("panjang: "+ ppArray[i].panjang + ", lebar: "+ ppArray[i].lebar);
       }
    }
    
}
