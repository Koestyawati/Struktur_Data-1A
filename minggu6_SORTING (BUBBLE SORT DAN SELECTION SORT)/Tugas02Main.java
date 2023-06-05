/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class Tugas02Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    DaftarAnggotaPaskibraka daftar = new DaftarAnggotaPaskibraka();
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Masukkan data peserta ke-" + (i+1) + ":");
      System.out.print("Nama: ");
      String nama = input.nextLine();
      System.out.print("Kelas: ");
      String kelas = input.nextLine();
      System.out.print("Tinggi: ");
      int tinggi = input.nextInt();
      input.nextLine();
      Tugas02 m = new Tugas02(nama, kelas, tinggi);
      daftar.tambah(m);
      System.out.println("----------------------");
    }
    
    System.out.println("Daftar peserta sebelum diurutkan:");
    daftar.tampil();
    
    daftar.Seleksi();
    daftar.Sorting();
    
    System.out.println("Daftar peserta yang lolos seleksi dan sudah diurutkan berdasarkan tinggi:");
    daftar.tampil();
  }
}
