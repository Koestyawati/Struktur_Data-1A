/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author HP 745 G5
 */
public class Tugas01AMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas01A[] daftarBarang = {
            new Tugas01A("Pensil", 35, 1000),
            new Tugas01A("Buku", 20, 5000),
            new Tugas01A("Penggaris", 50, 1500),
            new Tugas01A("Bulpen", 25, 2000)
        };

        System.out.println("Sebelum diurutkan: ");
        for (Tugas01A barang : daftarBarang) {
            System.out.println(barang.getNama() + " (" + barang.getStok() + " pcs) - Rp " + barang.getHarga());
        }

        insertionSort(daftarBarang);

        System.out.println("\nSetelah diurutkan: ");
        for (Tugas01A barang : daftarBarang) {
            System.out.println(barang.getNama() + " (" + barang.getStok() + " pcs) - Rp " + barang.getHarga());
        }
    }

    public static void insertionSort(Tugas01A[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Tugas01A key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getStok() < key.getStok()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
