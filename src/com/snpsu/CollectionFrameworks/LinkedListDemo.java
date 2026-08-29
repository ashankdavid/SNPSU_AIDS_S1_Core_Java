package com.snpsu.CollectionFrameworks;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add() → insert element
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("LinkedList: " + list);

        // addFirst() → insert at beginning
        list.addFirst("Start");

        // addLast() → insert at end
        list.addLast("End");

        System.out.println("After addFirst and addLast: " + list);

        // getFirst() → access first element
        System.out.println("First element: " + list.getFirst());

        // removeFirst() → remove first element
        list.removeFirst();

        System.out.println("After removing first: " + list);
    }
}

/*
FEATURES OF LINKEDLIST

1. Implements List and Deque interfaces
2. Maintains insertion order
3. Allows duplicate elements
4. Uses node structure internally
5. Faster insertion and deletion compared to ArrayList
6. Slower random access compared to ArrayList
7. Important methods:
   add()
   addFirst()
   addLast()
   getFirst()
   removeFirst()
*/