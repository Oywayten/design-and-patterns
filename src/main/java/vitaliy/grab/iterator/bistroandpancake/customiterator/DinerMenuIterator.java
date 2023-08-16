package vitaliy.grab.iterator.bistroandpancake.customiterator;

/**
 * Oywayten 08.08.2023.
 */

public class DinerMenuIterator implements Iterator {
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
}
