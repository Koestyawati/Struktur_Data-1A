/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu8_UTS;

/**
 *
 * @author HP 745 G5
 */
public class Barang {
    String kode;
    String namaBarang;
    int stok;
    int hargaSatuan;
    
    public Barang(String kode, String namaBarang, int stok, int hargaSatuan){
        kode = kode;
        namaBarang = namaBarang;
        stok = stok;
        hargaSatuan = hargaSatuan;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }
    
    public String getKode(){
    return kode;
    }
    
    public String getNamaBarang(){
        return namaBarang;
    }
    
    public int getStok(){
        return stok;
    }
    
    public int getHargaSatuan(){
        return hargaSatuan;
    }
}
