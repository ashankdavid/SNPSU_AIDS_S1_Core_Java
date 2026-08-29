package com.snpsu.CollectionFrameworks;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Creating TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // put() → insert key-value pairs
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(4, "D");

        System.out.println("TreeMap: " + map);

        // get(key) → retrieve value using key
        System.out.println("Value for key 2: " + map.get(2));

        // firstKey() → smallest key
        System.out.println("First Key: " + map.firstKey());

        // lastKey() → largest key
        System.out.println("Last Key: " + map.lastKey());

        // containsKey() → check if key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // remove() → remove entry
        map.remove(2);

        System.out.println("After removing key 2: " + map);

        // size() → number of entries
        System.out.println("Size: " + map.size());
    }
}

/*
FEATURES OF TREEMAP

1. Stores elements as key-value pairs
2. Keys must be unique
3. Keys are automatically sorted
4. Does NOT allow null keys
5. Uses Red-Black Tree internally
6. Slower than HashMap but maintains sorted order
7. Important methods:
   put()
   get()
   remove()
   containsKey()
   firstKey()
   lastKey()
   size()
*/