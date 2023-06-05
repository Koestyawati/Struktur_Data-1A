/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu9;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class StackMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stack stk = new Stack(5);
      Scanner sc = new Scanner(System.in);
      
      char pilih;
      do{
          System.out.print("Jenis: ");
          String jenis = sc.nextLine();
          System.out.print("Warna: ");
          String warna = sc.nextLine();
          System.out.print("Merk: ");
          String merk = sc.nextLine();
          System.out.print("Ukuran: ");
          String ukuran = sc.nextLine();
          System.out.print("Harga: ");
          double harga = sc.nextDouble();
          
          pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
          System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
          pilih = sc.next().charAt(0);
          sc.nextLine();
          stk.push(p);
      }while (pilih == 'y');
      
      stk.print();
      stk.pop();
      stk.peek();
      stk.print();;
    }
    
}
