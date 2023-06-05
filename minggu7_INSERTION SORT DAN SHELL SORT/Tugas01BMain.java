/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu7;

/**
 *
 * @author HP 745 G5
 */
public class Tugas01BMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas01B[] barangList = {
                new Tugas01B("Pensil", 35, 1000),
                new Tugas01B("Buku", 20, 5000),
                new Tugas01B("Penggaris", 50, 1500),
                new Tugas01B("Bulpen", 25, 2000)
        };

        int gap = barangList.length / 2;

        while (gap > 0) {
            for (int i = gap; i < barangList.length; i++) {
                Tugas01B temp = barangList[i];
                int j = i;

                while (j >= gap && barangList[j - gap].getStok() < temp.getStok()) {
                    barangList[j] = barangList[j - gap];
                    j -= gap;
                }

                barangList[j] = temp;
            }

            gap /= 2;
        }

        for (Tugas01B barang : barangList) {
            System.out.println(barang.toString());
        }
    }
    
}
