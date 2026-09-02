package com.snpsu.DataStructure.LinkedList.DLL;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data =data;
        this.prev =null;
        this.next =null;
    }
}
public class DLL {
    Node head;
    DLL(){
        head = null;

    }
    void insertAtHead(int val){
        Node n =new Node(val);
        if (head != null){
            n.next = head;
            head.prev = n;
        }
        head = n;
    }

    void insertAtTail(int val){
        Node n =new Node(val);

        if(head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev =temp;
    }

// Size of the DLL
    int getSize(){
        int size = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        Node n = new Node(val);
        int size = getSize();

        if(pos<0 || pos>size){
            System.out.println("Get Lost");
        }else if(pos==0){
            n.next = head;
            if(head != null){
                head.prev =n;
            }
            head = n;
        }else{
            Node temp = head;
            while(--pos>0){
                temp = temp.next;
            }
            n.next = temp.next;
            n.prev = temp;

            if(temp.next!=null){
                temp.next.prev=n;
            }
            temp.next=n;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Underflow");
            return;
        }
        Node toDelete = head;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
        toDelete = null;
    }

    void deleteByValue(int val){

        if (head==null){
            System.out.println("List is Empty");
            return;
        }

        if(head.data==val){
            Node toDelete = head;
            head=head.next;

            if(head!=null){
                head.prev=null;
            }
            toDelete = null;
            return;
        }

        Node temp=head;
        while(temp!=null&&temp.data!=val){
            temp=temp.next;
        }

        if(temp==null){
            System.out.println("Value not found");
            return;
        }

        temp.prev.next=temp.next;

        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
    }

}
