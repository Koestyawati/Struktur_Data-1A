/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu4;
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
        Barang[] barang = {
                new Barang("BRG001", "Sabun", 2000, 20),
                new Barang("BRG002", "Pasta gigi", 5000, 15),
                new Barang("BRG003", "Biore", 1500, 25),
                new Barang("BRG004", "Shampo", 3000, 10),
                new Barang("BRG005", "Sikat gigi", 5000, 5),
        };

        TransaksiBarang transaksiBarang = new TransaksiBarang(barang);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("========================");
            System.out.println("TOKO MUNDUR MUNDUR");
            System.out.println("========================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");

            System.out.print("Pilih[1-4]: ");
            int pilihan = scanner.nextInt();
            
            System.out.println("=======================================");
            System.out.println("           DAFTAR BARANG               ");
            System.out.println("=======================================");
            System.out.println("kode       Nama         Harga       stok");
            System.out.println("BRG001     Sabun        2000        20");
            System.out.println("BRG002     Pasta gigi   5000        15");
            System.out.println("BRG003     Biore        1500        25");
            System.out.println("BRG004     Shampo       3000        10");
            System.out.println("BRG005     Sikat gigi   5000        5");
            
            switch(pilihan){
                case 1:
                    transaksiBarang.tampilBarang();
                    break;
                case 2: 
                    System.out.print("Masukkan Kode Barang : ");
                    String kode = scanner.next();

                    System.out.println("Apakah anda akan belanja rmbali [Y|N] ? : ");
                    String jawaban = scanner.next();
                    break;
            }
        }
    }   
}
