package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FooTest {
    @Test
    public void testFoo() {
        Foo m = new Foo();

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < 1000; j++)
            list.add(j);
        m.foo(list);
    }
}
