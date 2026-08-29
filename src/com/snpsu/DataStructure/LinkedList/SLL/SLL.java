package com.snpsu.DataStructure.LinkedList.SLL;

class Node{
    int data;
    Node next; // pointing towards node obj

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;
    SLL(){
        this.head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val); // create node
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val); // create node
        if(head==null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    int getLLSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp= temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        Node n = new Node(val);
        int size = getLLSize();
        if(pos < 0 || pos > size){
            System.out.println("Get Lost");
        }else if(pos == 0){
            n.next = head;
            head = n;
        }else{
            Node temp = head;
            while(--pos > 0){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    void printSLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtTail(23);
        sll.printSLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.printSLL();
        sll.insertAtHead(40);
        sll.printSLL();
        sll.insertAtPos(500, 4);
        sll.printSLL();
    }
}
