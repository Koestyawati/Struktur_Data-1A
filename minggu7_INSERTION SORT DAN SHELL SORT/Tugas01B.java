/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author HP 745 G5
 */
public class Tugas01B {
    private String nama;
    private int stok;
    private int harga;

    public Tugas01B(String nama, int stok, int harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public String toString() {
        return nama + " - Stok: " + stok + " - Harga: " + harga;
    }
}
