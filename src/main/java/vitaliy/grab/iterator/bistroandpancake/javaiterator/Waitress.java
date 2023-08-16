package vitaliy.grab.iterator.bistroandpancake.javaiterator;

import java.util.Iterator;

/**
 * Oywayten 08.08.2023.
 */

public class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;
    private final Menu cafeMenu;
    private static final String NEW_LINE = System.lineSeparator();

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println(menuToString());
    }

    public String menuToString() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        return "MENU" + NEW_LINE + "----" + NEW_LINE
                + "BREAKFAST" + NEW_LINE + menuToString(pancakeIterator) + NEW_LINE
                + "LUNCH" + NEW_LINE + menuToString(dinerIterator)  + NEW_LINE
                + "DINNER" + NEW_LINE + menuToString(cafeIterator);
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
