/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu14;

/**
 *
 * @author HP 745 G5
 */
public class BinaryTreeArray {
     int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int newData) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = newData;
        } else {
            System.out.println("Binary tree is full. Cannot add more elements.");
        }
    }

    void traverseInOrder() {
        traverseInOrder(1);
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 1);
        }
    }

    void traversePreOrder() {
        traversePreOrder(1);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart);
            traversePreOrder(2 * idxStart + 1);
        }
    }

    void traversePostOrder() {
        traversePostOrder(1);
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart);
            traversePostOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
        }
    }
}
