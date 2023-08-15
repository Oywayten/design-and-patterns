package vitaliy.grab.iterator.bistroandpancake;

import java.util.List;

/**
 * Oywayten 08.08.2023.
 */

public class PancakeHouseIterator implements Iterator {
    private final List<MenuItem> items;
    private int position;

    public PancakeHouseIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}
