/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu8_UTS;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class BarangMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Barang[] daftarBarang = new Barang[10];
        int jmlBarang = 0;

        while (true) {
            System.out.println("1. Input Data Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Cek Stok Barang Terbanyak");
            System.out.println("4. Cek Sok Barang Terlaris");
            System.out.println("5. Tampil Barang");
            System.out.print("Masukkan Angka Menu yang ingin dipilih: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Input Data Barang ");
                    System.out.println("Kode = A001");
                    System.out.println("Nama = Bulpoin Warna");
                    System.out.println("Stok = 2");
                    System.out.println("Harga = 10000");
                    System.out.println("Kode = A002");
                    System.out.println("Nama = Buku Tulis");
                    System.out.println("Stok = 10");
                    System.out.println("Harga = 2000");
                    System.out.println("Kode = A003");
                    System.out.println("Nama = Penggaris");
                    System.out.println("Stok = 5");
                    System.out.println("Harga = 1500");
                    
                    System.out.println("Apakah anda akan belanja rmbali [Y|N] ? : ");
                    String jawaban = input.next();
                    break;
                case 2:
                    System.out.println("Data Barang yang ada");
                    System.out.println("---------------------------------------------");
                    System.out.println("kode| Nama          |  Stok   |Harga ");
                    System.out.println("A001  Bulpoin Warna     2       10000");
                    System.out.println("-----------------------------------------");
                    System.out.println("---------------------------------------------");
                    System.out.println("kode| Nama          |  Stok   |Harga ");
                    System.out.println("A002  Buku Tulis        10      2000");
                    System.out.println("-----------------------------------------");
                    System.out.println("---------------------------------------------");
                    System.out.println("kode| Nama          |  Stok   |Harga ");
                    System.out.println("A003  Penggaris         5      1500");
                    System.out.println("-----------------------------------------");
                    
                    System.out.print("Masukkan kode baran yang akan dibeli =");
                    String jwbn = input.next();
                    System.out.print("Masukkan jumlah barang yang dibeli = ");
                    String jwb = input.next();
                     break;
            }      
        }
    }
    
}
