/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu4;

/**
 *
 * @author HP 745 G5
 */
public class TransaksiBarang {
    Barang[] barang;
    
    public TransaksiBarang(Barang[] barang){
       barang = barang;
    }
    public void tampilBarang(){
        for (int i = 0; i < barang.length; i++){
            barang[i].tampilBarang();
            System.out.println("============================");
        }
    }
    
    public void beliBarang(String kode, int jumlah){
        for (int i = 0; i < barang.length; i++) {
            if (barang[i].kode.equals(kode)) {
                if (barang[i].stok >= jumlah) {
                    int total = jumlah * barang[i].harga;
                    System.out.println("Total Harga : " + total);
                    barang[i].stok -= jumlah;
                    System.out.println("Pembelian Berhasil");
                } else {
                    System.out.println("Stok tidak mencukupi");
                }
                return;
            }
        }
        System.out.println("Barang tidak ditemukan");
    }
    
    public void tampilBarangPembelian() {
        System.out.println("Barang yang sudah dibeli :");
        for (int i = 0; i < barang.length; i++) {
            if (barang[i].stok < 10) {
                barang[i].tampilBarang();
                System.out.println("==========================");
            }
        }
    }
}
