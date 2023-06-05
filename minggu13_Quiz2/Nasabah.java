/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu13_Quiz2;

/**
 *
 * @author HP 745 G5
 */
public class Nasabah {
    private String noRekening;
    private String nama;
    private Nasabah next;
    
    public Nasabah(String noRek, String nm){
        noRekening = noRek;
        nama = nm;
        next = null;
    }
    
    public Nasabah(){
        next = null;
    }
    
    public void setNext(Nasabah n){
        next=n;
    }
    
    public Nasabah getNext(){
        return next;
    }
    
    public void print(){
        System.out.println("No. Rekening: "+ noRekening);
        System.out.println("Nama: " + nama);
        System.out.println();
    }
    
    void Print() {
        System.out.println("No. Rekening: " + noRekening);
        System.out.println("Nama: " + nama);
    }
}
