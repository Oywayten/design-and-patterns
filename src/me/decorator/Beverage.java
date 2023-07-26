package me.decorator;

/**
 * Oywayten 25.07.2023.
 */

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
