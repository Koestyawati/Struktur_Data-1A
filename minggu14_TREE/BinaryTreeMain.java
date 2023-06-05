/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu14;

/**
 *
 * @author HP 745 G5
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find 5: " + bt.find(5));
        System.out.println("Minimum value: " + bt.findMinValue());
        System.out.println("Maximum value: " + bt.findMaxValue());

        System.out.println("Leaf nodes: ");
        bt.printLeafNodes();
        System.out.println("");

        System.out.println("Number of leaf nodes: " + bt.countLeafNodes());
    }
    
}
