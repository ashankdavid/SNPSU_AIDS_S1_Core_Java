package com.snpsu.CollectionFrameworks;


import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // add() → insert elements
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); // duplicates allowed

        System.out.println("ArrayList: " + list);

        // get(index) → access element
        System.out.println("Element at index 1: " + list.get(1));

        // size() → total elements
        System.out.println("Size: " + list.size());

        // contains() → checks if element exists
        System.out.println("Contains 30? " + list.contains(30));

        // remove(index) → remove element
        list.remove(2);

        System.out.println("After removing index 2: " + list);
    }
}

/*
FEATURES OF ARRAYLIST

1. Implements List interface
2. Maintains insertion order
3. Allows duplicate elements
4. Dynamic size (can grow automatically)
5. Supports index-based access
6. Fast for reading elements
7. Important methods:
   add()
   get()
   remove()
   size()
   contains()
*/