/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author HP 745 G5
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m: listMhs){
           m.tampil();
           System.out.println("----------------------");
        }
    }
    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
       for(int i=0; i<listMhs.length-1; i++){
           for(int j=1; j<listMhs.length-i; j++){
               if(listMhs[j].ipk > listMhs[j-1].ipk){
                   //dibawah ini proses swap atau penukaran
                   Mahasiswa tmp = listMhs[j];
                   listMhs[j] = listMhs[j-i];
                   listMhs[j-1] = tmp;
               }
           }
       }
    }
    void SelectionSort(){
        for(int i=0; i<listMhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listMhs.length; j++){
                if(listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
