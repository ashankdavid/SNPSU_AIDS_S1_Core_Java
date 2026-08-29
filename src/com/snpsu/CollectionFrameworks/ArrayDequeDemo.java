package com.snpsu.CollectionFrameworks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        // Creating ArrayDeque
        Deque<Integer> dq = new ArrayDeque<>();

        // addFirst() → insert at front
        dq.addFirst(10);

        // addLast() → insert at rear
        dq.addLast(20);
        dq.addLast(30);

        System.out.println("ArrayDeque: " + dq);

        // peekFirst() → view first element
        System.out.println("First element: " + dq.peekFirst());

        // peekLast() → view last element
        System.out.println("Last element: " + dq.peekLast());

        // removeFirst() → remove first element
        dq.removeFirst();

        // removeLast() → remove last element
        dq.removeLast();

        System.out.println("After removals: " + dq);
    }
}

/*
FEATURES OF ARRAYDEQUE

1. Implements Deque interface
2. Allows insertion and deletion from both ends
3. Faster than Stack and LinkedList for stack/queue operations
4. Does NOT allow null elements
5. Can work as both Stack and Queue
6. Important methods:
   addFirst()
   addLast()
   removeFirst()
   removeLast()
   peekFirst()
   peekLast()
*/