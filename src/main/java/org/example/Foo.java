package org.example;

import java.util.*;

public class Foo {

    public int foo(List<Integer> list) {
        int k = 0;
        for (int i = 0; i < 100000; i++) {
            Collection<Integer> c = Collections.synchronizedCollection(list);
            synchronized (c) {
                for (Integer j : c)
                    k += j;
            }
        }
        return k;
    }
}