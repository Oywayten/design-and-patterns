package vitaliy.grab.iterator.bistroandpancake.javaiterator;

import java.util.Iterator;

/**
 * Oywayten 08.08.2023.
 */

public class DinerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        return items[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
