/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author HP 745 G5
 */
public class Tugas1B {
    public static boolean search(int[] arr, int x ){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[]arr = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        int x = 50;
        
        boolean ditemukan = search (arr,x);
        if (ditemukan){
            System.out.println("Data ditemukan di array");
            
        } else{
            System.out.println("Data tidak ditemukan di array");
        }
    }
    
}

