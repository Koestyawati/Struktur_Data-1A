/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;
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
        Scanner scanner = new Scanner(System.in);

        Tugas02[] data = new Tugas02[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.next();
            System.out.print("Nilai A: ");
            int nilaiA = scanner.nextInt();
            System.out.print("Nilai B: ");
            int nilaiB = scanner.nextInt();
            System.out.print("Nilai C: ");
            int nilaiC = scanner.nextInt();

            data[i] = new Tugas02(nama, nilaiA, nilaiB, nilaiC);
            System.out.println();
        }

        // Pengurutan data dengan shell sort
        int jarak = data.length / 2;
        while (jarak > 0) {
            for (int i = jarak; i < data.length; i++) {
                int j = i;
                Tugas02 tmp = data[i];
                while (j >= jarak && data[j-jarak].total < tmp.total) {
                    data[j] = data[j-jarak];
                    j -= jarak;
                }
                data[j] = tmp;
            }
            jarak /= 2;
        }

        // Menampilkan 3 Mahasiswa terbaik
        System.out.println("Mahasiswa terbaik:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + data[i].nama + " (total nilai: " + data[i].total + ")");
        }

        // Menampilkan 3 Mahasiswa dengan total nilai terbaik
        int maxTotal = data[0].total;
        System.out.println("\nMahasiswa dengan total nilai terbaik:");
        for (int i = 0; i < 3; i++) {
            if (data[i].total == maxTotal) {
                System.out.println((i+1) + ". " + data[i].nama + " (total nilai: " + data[i].total + ")");
            }
        }
    }
    
}
