/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu6;

/**
 *
 * @author HP 745 G5
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={15, 10, 7, 22, 5};
        Sort urut=new Sort(a, a.length);
        
        System.out.println("Data sebelum diurutkan:");
        urut.tampilData();

        urut.bubbleSort();

        System.out.println("Data sesudah urut Bubble sort (ASC):");
        urut.tampilData();
        
        urut.selectionSort();

        System.out.println("Data sesudah urut Selection sort (ASC):");
        urut.tampilData();
    }
}
