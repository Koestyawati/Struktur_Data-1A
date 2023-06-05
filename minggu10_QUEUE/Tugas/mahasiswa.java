/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu10.Tugas;

/**
 *
 * @author HP 745 G5
 */
public class mahasiswa {
      private String nim;
  private String nama;
  private int absen;
  private double ipk;

  public mahasiswa(String nim, String nama, int absen, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.absen = absen;
    this.ipk = ipk;
  }

  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public int getAbsen() {
    return absen;
  }

  public double getIpk() {
    return ipk;
  }
}
