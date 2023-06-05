/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author HP 745 G5
 */
public class BarangMain {
    public static void main(String[] args){
        Barang bl = new Barang();
        bl.namaBarang = "Corsair 2 GB";
        bl.jenisBarang = "DDR";
        bl.hargaSatuan = 250000;
        bl.stok = 10;
        bl.tambahStok(1);
        bl.kurangiStok(3);
        bl.tampilBarang();
        int hargaTotal = bl.hitungHargaTotal(4);
        System.out.println("Harga 4 buah ="+hargaTotal);
        Barang b2 = new Barang("Logitech", "    Whireles Mouse", 25, 150000);
        b2.tampilBarang();
    }
}