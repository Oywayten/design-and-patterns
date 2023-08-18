package vitaliy.grab.composite;

/**
 * Oywayten 08.08.2023.
 */

public class MenuItem extends MenuComponent {
    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
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
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(" ").append(getName());
        if (isVegetarian()) {
            sb.append("(v)");
        }
        sb.append(", ").append(getPrice()).append(NEW_LINE);
        sb.append(" -- ").append(getDescription()).append(NEW_LINE);
        return sb.toString();
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
