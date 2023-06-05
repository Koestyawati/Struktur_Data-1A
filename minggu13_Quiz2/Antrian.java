/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu13_Quiz2;

/**
 *
 * @author HP 745 G5
 */
public class Antrian {
    private Nasabah head;
    private Nasabah tail;
    
    public Antrian(){
        head = null;
        tail = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void add(String noRek, String nm){
        Nasabah n = new Nasabah(noRek, nm);
        if (isEmpty()){
            head = n;
            tail = n;
        }else{
            tail.setNext(n);
            tail = n;
        }
    }
    
     public void remove() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
    }
     
     public void printAntrian(){
         if (isEmpty()){
             System.out.println("Antrian kosong.");
         }else{
             Nasabah current = head;
             while (current !=null){
                 current.print();
                 current.getNext();
             }
         }
     }
     
     void enqueue(String noRek, String nm) {
        Nasabah nasabahBaru = new Nasabah(noRek, nm);
        if (tail == null) {
            head = nasabahBaru;
            tail = nasabahBaru;
        } else {
            tail = nasabahBaru;
            tail = nasabahBaru;
        }
    }

    Nasabah dequeue() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Nasabah nasabahTerdepan = head;
            head = head;
            if (head == null) {
                tail = null;
            }
            return nasabahTerdepan;
        }
    }
    
}
