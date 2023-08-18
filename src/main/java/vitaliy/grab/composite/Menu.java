package vitaliy.grab.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Oywayten 16.08.2023.
 */

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append(NEW_LINE).append(getName()).append(", ").append(getDescription())
                .append(NEW_LINE).append("---------------------").append(NEW_LINE);
        for (MenuComponent menuComponent : menuComponents) {
            sb.append(menuComponent);
        }
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}