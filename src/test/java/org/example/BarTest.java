package org.example;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Ignore
public class BarTest {
    @Test
    public void testBar() {
        Bar m = new Bar();
        assertEquals("My name is test. I am 11 years old. Also, I like banana!", m.first("test", 1, true));
    }

    @Test
    public void testBarAgain() {
        Bar m = new Bar();
        assertEquals("My name is bye. I am 21 years old. Also, I don't like banana!", m.first("bye", 11, false));
    }
}
