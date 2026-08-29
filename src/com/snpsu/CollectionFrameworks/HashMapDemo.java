package com.snpsu.CollectionFrameworks;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put() → insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("HashMap: " + map);

        // get() → retrieve value
        System.out.println("Value for key 2: " + map.get(2));

        // containsKey() → check key existence
        System.out.println("Contains key 3? " + map.containsKey(3));

        // remove() → remove entry
        map.remove(1);

        System.out.println("After removing key 1: " + map);
    }
}

/*
FEATURES OF HASHMAP

1. Stores elements as key-value pairs
2. Keys must be unique
3. Values can be duplicated
4. Does NOT maintain insertion order
5. Uses hashing internally
6. Allows one null key
7. Important methods:
   put()
   get()
   remove()
   containsKey()
*/