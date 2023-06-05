/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu13_Quiz2;

/**
 *
 * @author HP 745 G5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Antrian antrian = new Antrian();

        // Menambahkan nasabah ke antrian
        antrian.enqueue("1234567890", "Elisa Aditama");
        antrian.enqueue("0987654321", "Pratama Arhan");
        antrian.enqueue("9876543210", "David dwi");

        // Mengambil dan mencetak nasabah dari antrian
        Nasabah nasabah1 = antrian.dequeue();
        if (nasabah1 != null) {
            System.out.println("Nasabah pertama:");
            nasabah1.print();
        }

        Nasabah nasabah2 = antrian.dequeue();
        if (nasabah2 != null) {
            System.out.println("Nasabah kedua:");
            nasabah2.print();
        }

        Nasabah nasabah3 = antrian.dequeue();
        if (nasabah3 != null) {
            System.out.println("Nasabah ketiga:");
            nasabah3.print();
        }

        // Mencoba mengambil nasabah dari antrian kosong
        Nasabah nasabah4 = antrian.dequeue();
        if (nasabah4 != null) {
            System.out.println("Nasabah keempat:");
            nasabah4.print();
        }
    }
}
    

