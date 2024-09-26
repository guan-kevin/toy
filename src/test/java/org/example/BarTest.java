package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BarTest {
    @Test
    public void testBar() {
        Bar m = new Bar();
        assertEquals("My name is test. I am 11 years old. I like banana!", m.first("test", 1, true));
    }
}
