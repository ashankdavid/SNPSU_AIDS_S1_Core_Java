package com.snpsu.CollectionFrameworks;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // add() → insert elements
        set.add(10);
        set.add(20);
        set.add(20); // duplicate ignored
        set.add(30);

        System.out.println("HashSet: " + set);

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
FEATURES OF HASHSET

1. Implements Set interface
2. Does NOT allow duplicate elements
3. Does NOT maintain insertion order
4. Uses hashing internally
5. No index-based access
6. Very fast for add, remove and search operations
7. Important methods:
   add()
   remove()
   contains()
   size()
*/
