/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author HP 745 G5
 */
public class shellSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={73, 67, 56, 32, 52, 41, 83, 37, 32, 10};
        shellShort urut=new shellShort(a, a.length);
        
        System.out.println("Data sebelum diurutkan:");
        urut.tampilData();

        urut.ShellSort();

        System.out.println("Data sesudah urut dengan shell short (ASC):");
        urut.tampilData();
    }
}