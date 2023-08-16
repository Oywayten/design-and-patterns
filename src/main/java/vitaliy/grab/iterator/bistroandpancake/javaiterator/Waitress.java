package vitaliy.grab.iterator.bistroandpancake.javaiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Oywayten 08.08.2023.
 */

public class Waitress {
    private final List<Menu> menuList = new ArrayList<>();
    private static final String NEW_LINE = System.lineSeparator();

    public Waitress() {
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void printMenu() {
        System.out.println(menuToString());
    }

    public String menuToString() {
        StringBuilder sb = new StringBuilder("MENU").append(NEW_LINE).append("----").append(NEW_LINE);
        for (Menu menu : menuList) {
            String name = menu.getName();
            sb.append(name).append(NEW_LINE);
            Iterator<MenuItem> iterator = menu.createIterator();
            String menuToString = menuToString(iterator);
            sb.append(menuToString);
            sb.append(NEW_LINE);
        }
        return sb.toString();
    }

    private String menuToString(Iterator<MenuItem> iterator) {
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            sb.append(menuItem.getName()).append(", ");
            sb.append(menuItem.getPrice()).append(" -- ");
            sb.append(menuItem.getDescription()).append(NEW_LINE);
        }
        return sb.toString();
    }
}
