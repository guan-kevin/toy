package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Foo {

    public int foo(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < 1000000; i++)
            for (Integer j : list)
                total += j;
        return total;
    }
}