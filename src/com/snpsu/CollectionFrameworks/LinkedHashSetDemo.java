package com.snpsu.CollectionFrameworks;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // add() → insert elements
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println("LinkedHashSet: " + set);

        // contains() → check element
        System.out.println("Contains 20? " + set.contains(20));

        // remove() → remove element
        set.remove(10);

        System.out.println("After removing 10: " + set);

        // size() → number of elements
        System.out.println("Size: " + set.size());
    }
}

/*
FEATURES OF LINKEDHASHSET

1. Implements Set interface
2. Does NOT allow duplicate elements
3. Maintains insertion order
4. Uses hashing internally
5. Slightly slower than HashSet
6. No index-based access
7. Important methods:
   add()
   remove()
   contains()
   size()
*/