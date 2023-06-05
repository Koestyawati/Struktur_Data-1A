/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author HP 745 G5
 */
public class Tugas02 {
    String nama, kelas;
  int tinggi;
  
  public Tugas02(String a, String b, int c) {
    nama = a;
    kelas = b;
    tinggi = c;
  }
  
  public void tampilIdentitas() {
    System.out.println("Nama: " + nama);
    System.out.println("Kelas: " + kelas);
    System.out.println("Tinggi: " + tinggi + " cm");
  }
}

class DaftarAnggotaPaskibraka {
  Tugas02[] listPeserta = new Tugas02[10];
  int id = 0;
  
  public void tambah(Tugas02 m) {
    if (id < 10) {
      listPeserta[id] = m;
      id++;
    }
    else {
      System.out.println("Daftar sudah penuh!");
    }
  }
  
  public void tampil() {
    for (int i = 0; i < id; i++) {
      System.out.println("ID: " + (i+1));
      listPeserta[i].tampilIdentitas();
      System.out.println("----------------------");
    }
  }
  
  public void Sorting() {
    for (int i = 0; i < id-1; i++) {
      for (int j = i+1; j < id; j++) {
        if (listPeserta[i].tinggi < listPeserta[j].tinggi) {
          Tugas02 temp = listPeserta[i];
          listPeserta[i] = listPeserta[j];
          listPeserta[j] = temp;
        }
      }
    }
  }
  
  public void Seleksi() {
    int count = 0;
    for (int i = 0; i < id; i++) {
      if (listPeserta[i].tinggi >= 170) {
        listPeserta[count] = listPeserta[i];
        count++;
      }
    }
    id = count;
  }
}
