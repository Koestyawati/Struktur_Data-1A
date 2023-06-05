/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author HP 745 G5
 */
public class Tugas1_Kubus {
    private double sisi;

    public Tugas1_Kubus(double s) {
        sisi = s;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
}
