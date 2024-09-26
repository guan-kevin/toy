package org.example;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Ignore
public class FooTest {
    @Test
    public void testFoo() {
        Foo m = new Foo();
        assertEquals(45000000, m.foo(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }
}
