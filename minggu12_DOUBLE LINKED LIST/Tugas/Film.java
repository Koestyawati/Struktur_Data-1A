/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12.Tugas;

/**
 *
 * @author HP 745 G5
 */
public class Film {
    int id;
    String judul;
    double rating;
    Film prev;
    Film next;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
