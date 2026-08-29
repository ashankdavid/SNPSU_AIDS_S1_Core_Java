package com.snpsu.CollectionFrameworks;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add() → elements stored in sorted order
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println("TreeSet (sorted): " + set);

        // first() → smallest element
        System.out.println("First element: " + set.first());

        // last() → largest element
        System.out.println("Last element: " + set.last());

        // remove() → remove element
        set.remove(20);

        System.out.println("After removing 20: " + set);
    }
}

/*
FEATURES OF TREESET

1. Implements NavigableSet interface
2. Does NOT allow duplicate elements
3. Automatically sorts elements
4. Uses Red-Black Tree internally
5. Slower than HashSet for basic operations
6. Useful when sorted data is required
7. Important methods:
   add()
   first()
   last()
   remove()
*/