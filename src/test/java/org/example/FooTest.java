package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FooTest {
    @Test
    public void testFoo() {
        Foo m = new Foo();
        assertEquals(100000000, m.foo(100000));
    }
}
