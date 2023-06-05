/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu4;

/**
 *
 * @author HP 745 G5
 */
public class Barang {
    String nama, kode;
    int harga, stok;
    
    public Barang(String kode, String nama, int harga, int stok){
        kode = kode;
        nama = nama;
        harga = harga;
        stok = stok;
    }
    public void tampilBarang(){
        System.out.println("Kode barang: "+kode);
        System.out.println("Nama Barang: "+nama);
        System.out.println("Harga Barang: "+harga);
        System.out.println("Stok Barang: "+stok);
    }
}
