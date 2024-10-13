package org.example;

import org.junit.Test;

public class BazTest {
    @Test
    public void testBaz() {
        Baz baz = new Baz();
        for (int i = 0; i < 100; i++) {
            baz.call(i > 0);
        }
    }
}
