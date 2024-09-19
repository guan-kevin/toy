package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foo {

    public int foo(int total) {
        int k = 0;
        for (int i = 0; i < total; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 1000; j++) {
                list.add(j);
            }
            
            for (Integer j : list) {
                k += 1;
            }
        }
        
        return k;
    }
}