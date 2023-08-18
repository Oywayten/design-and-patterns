package vitaliy.grab.composite;

/**
 * Oywayten 08.08.2023.
 */

public class Waitress {
    private final MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        System.out.println(this);
    }

    public String menuToString() {
        return allMenus.toString();
    }
}
