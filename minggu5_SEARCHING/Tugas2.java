/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;
import java.util.Scanner;
/**
 *
 * @author HP 745 G5
 */
public class Tugas2 {
    public static void main(String[] args) {
        String[][] dataMahasiswa = {
            {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
            {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
            {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
        };
        
        System.out.println("Daftar Kelompok Mahasiswa");
        System.out.println("kelompok-1 : Alfi, Safira, Tiara, Arif, Erdi");
        System.out.println("kelompok-2 : Yudha, Nisa, Yulia, Fuzan, Dwi");
        System.out.println("kelompok-3 : Dewa, Ana, Abdul, Dani, Ammar");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String namaMahasiswa = input.nextLine();
        
        boolean found = false;
        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                if (dataMahasiswa[i][j].equalsIgnoreCase(namaMahasiswa)) {
                    found = true;
                    System.out.println("Mahasiswa " + namaMahasiswa + " terdapat pada Kelompok ke-" + (i+1) + " pada urutan ke-" + (j+1));
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        
        if (!found) {
            System.out.println("Mahasiswa " + namaMahasiswa + " tidak ditemukan dalam data mahasiswa");
        }
    }
}
