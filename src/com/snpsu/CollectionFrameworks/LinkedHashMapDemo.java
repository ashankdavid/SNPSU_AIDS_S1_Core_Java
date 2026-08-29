package com.snpsu.CollectionFrameworks;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Creating LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // put() → insert key-value pairs
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        System.out.println("LinkedHashMap: " + map);

        // get() → retrieve value
        System.out.println("Value of key 1: " + map.get(1));

        // containsKey() → check key
        System.out.println("Contains key 2? " + map.containsKey(2));

        // remove() → remove entry
        map.remove(3);

        System.out.println("After removing key 3: " + map);

        // size() → number of entries
        System.out.println("Size: " + map.size());
    }
}

/*
FEATURES OF LINKEDHASHMAP

1. Stores elements as key-value pairs
2. Keys must be unique
3. Maintains insertion order
4. Allows one null key
5. Faster than TreeMap
6. Uses hashing with linked list internally
7. Important methods:
   put()
   get()
   remove()
   containsKey()
   size()
*/