package vitaliy.grab.iterator.bistroandpancake;

/**
 * Oywayten 08.08.2023.
 */

public class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;
    private static final String NEW_LINE = System.lineSeparator();

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println(menuToString());
    }

    public String menuToString() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        StringBuilder sb = new StringBuilder()
                .append("MENU").append(NEW_LINE).append("----").append(NEW_LINE)
                .append("BREAKFAST").append(NEW_LINE).append(printMenu(pancakeIterator)).append(NEW_LINE)
                .append("LUNCH").append(NEW_LINE).append(printMenu(dinerIterator));
        return sb.toString();
    }

    private String printMenu(Iterator iterator) {
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
