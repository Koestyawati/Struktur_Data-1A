/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu12.Tugas;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class AntrianVaksinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue queue = new Queue();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int menu = 0;

        do {
            System.out.println("++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++");

            menu = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi karakter '\n' setelah membaca angka

            switch (menu) {
                case 1:
                    System.out.println("-----------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------------------");
                    System.out.print("Nomor Antrian: ");
                    int noAntrian = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi karakter '\n' setelah membaca angka
                    System.out.print("- Nama Penerima: ");
                    String nama = scanner.nextLine();

                    queue.enqueue(noAntrian, nama);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
                    break;
            }
        } while (menu != 4);
        scanner.close();
    }
}