package com.snpsu.Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append("World");
        System.out.println(sbf);
        sbf.reverse();
        System.out.println(sbf);
        sbf.insert(4, "A");
        System.out.println(sbf);
        sbf.replace(5, 6, "A");
        System.out.println(sbf);
    }
}
