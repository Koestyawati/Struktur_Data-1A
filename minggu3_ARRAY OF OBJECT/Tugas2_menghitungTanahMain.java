/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class Tugas2_menghitungTanahMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah tanah: ");
        int jumlahTanah = input.nextInt();
        
        Tugas2_menghitungTanah[] arrTanah = new Tugas2_menghitungTanah[jumlahTanah];
        
        for (int i = 0; i < jumlahTanah; i++) {
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang: ");
            int panjang = input.nextInt();
            System.out.print("Lebar: ");
            int lebar = input.nextInt();
            arrTanah[i] = new Tugas2_menghitungTanah(panjang, lebar);
        }
        
        int maxLuas = 0;
        int maxIndex = 0;
        for (int i = 0; i < jumlahTanah; i++) {
            int luas = arrTanah[i].hitungLuas();
            System.out.println("Luas Tanah " + (i+1) + ": " + luas);
            if (luas > maxLuas) {
                maxLuas = luas;
                maxIndex = i;
            }
        }
        System.out.println("Tanah terluas: Tanah " + (maxIndex+1));
    }
}

    

