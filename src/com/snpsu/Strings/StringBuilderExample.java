package com.snpsu.Strings;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sbl = new StringBuilder("Hello");
        sbl.append("World");
        System.out.println(sbl);
        sbl.reverse();
        System.out.println(sbl);
        sbl.insert(4, "A");
        System.out.println(sbl);
        sbl.replace(5, 6, "A");
        System.out.println(sbl);
    }
}

