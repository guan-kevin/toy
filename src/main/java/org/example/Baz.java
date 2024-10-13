package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Baz {
    public class BazIterator implements Iterator<String> {
        private Iterator<String> iterator;

        public BazIterator(Iterator<String> iterator) {
            this.iterator = iterator;
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        public String next() {
            return iterator.next();
        }
    }

    public void call() {
        ArrayList<String> baz = new ArrayList<>();
        baz.add("a");
        baz.add("b");
        baz.add("c");

        BazIterator it = new BazIterator(baz.iterator());
        it.next();
        it.next();
        it.next();
    }
}
