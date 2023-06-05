/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author HP 745 G5
 */
public class tugasBarangMain {
    public static void main(String[] args){
        tugasBarang barang1 = new tugasBarang("Buku tulis", 5000, 10);
        int hargaTotal = barang1.hitungHargaTotal();
        double diskon = barang1.hitungDiskon();
        double hargaBayar = barang1.hitungHargaBayar();

        System.out.println("Harga total: " + hargaTotal);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga bayar: " + hargaBayar);
    }
}
