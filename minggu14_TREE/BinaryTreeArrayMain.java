/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu14;

/**
 *
 * @author HP 745 G5
 */
public class BinaryTreeArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BinaryTreeArray bta = new BinaryTreeArray();
    
            bta.add(6);
            bta.add(4);
            bta.add(8);
            bta.add(3);
            bta.add(5);
            bta.add(7);
            bta.add(9);
    
            System.out.print("In-order traversal: ");
            bta.traverseInOrder();
            System.out.println();
    
            System.out.print("Pre-order traversal: ");
            bta.traversePreOrder();
            System.out.println();
    
            System.out.print("Post-order traversal: ");
            bta.traversePostOrder();
            System.out.println();
    }
}