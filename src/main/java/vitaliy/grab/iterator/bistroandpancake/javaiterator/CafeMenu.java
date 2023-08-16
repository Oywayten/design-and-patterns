package vitaliy.grab.iterator.bistroandpancake.javaiterator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Oywayten 16.08.2023.
 */

public class CafeMenu implements Menu {
    private static final String NAME = "DINNER";
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        Collection<MenuItem> values = menuItems.values();
        return getIterator(values);
    }

    @Override
    public String getName() {
        return NAME;
    }

    private static Iterator<MenuItem> getIterator(Collection<MenuItem> values) {
        return values.iterator();
    }
}