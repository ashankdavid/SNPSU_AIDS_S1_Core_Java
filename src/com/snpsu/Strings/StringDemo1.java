package com.snpsu.Strings;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "Ashank";
        String s2 = "Ashank";
        String s3 = new String("Ashank");
        System.out.println(s1==s2); // true
        System.out.println(s1==s3); // false
    }
}
