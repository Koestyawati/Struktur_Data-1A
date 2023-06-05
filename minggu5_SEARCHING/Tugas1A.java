/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author HP 745 G5
 */
public class Tugas1A {
     public static int search(int arr[], int x){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        int arr []= {17, 20, 26, 33, 37, 41, 52, 65, 73, 83};
        int x = 41;
        
        int hasil = search(arr,x);
        if (hasil == -1) {
            System.out.println("Elemen yang dicari tidak ada didalam array");
        } else{
            System.out.println("Elemen berada pada index "+ hasil);
        }
    }
}

