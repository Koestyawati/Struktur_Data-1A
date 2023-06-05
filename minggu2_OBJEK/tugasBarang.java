/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu2;

/**
 *
 * @author HP 745 G5
 */
public class tugasBarang {
    String nama;
    int hargaSatuan, jumlah;
    
    tugasBarang(){
    }
    tugasBarang(String nm, int hs, int jml){
        nama = nm;
        hargaSatuan = hs;
        jumlah = jml;
    }
    
    public int hitungHargaTotal(){
        return hargaSatuan*jumlah;
    }
    
    public double hitungDiskon(){
        int hargaTotal = hitungHargaTotal();
        if(hargaTotal > 100000){
            return 0.1*hargaTotal;
        }else if (hargaTotal >= 50000){
            return 0.5*hargaTotal;
        }else{
            return 0;
        }
    }
    
    public double hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
    }
}
