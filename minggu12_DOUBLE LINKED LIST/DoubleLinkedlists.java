/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12;

/**
 *
 * @author HP 745 G5
 */
public class DoubleLinkedlists {
    Node head;
    int size;
    
    public DoubleLinkedlists(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpety(){
        return head == null;
    }
    
    public void addFirst(int item){
        if (isEmpety()){
            head = new Node(null, item, null);
        }else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item){
        if(isEmpety()){
            addFirst(item);
        }else{
            Node current = head;
            while (current.next !=null){
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    public void ass(int item, int index) throws Exception{
        if (isEmpety()){
            addFirst(item);
        }else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node current = head;
            int i = 0;
            while (i < index){
            current = current.next;
            i++;
        }
            if(current.prev == null){
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpety()){
            Node tmp = head;
            while (tmp !=null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked Lists Kosong");
        }
    }
}
