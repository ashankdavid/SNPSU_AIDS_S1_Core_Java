package com.snpsu.Generics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
//        list.add("Ashank"); // Complie Time Error Detection
        list.add(10);
    }
}
