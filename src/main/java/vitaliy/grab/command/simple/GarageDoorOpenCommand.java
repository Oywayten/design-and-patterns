package vitaliy.grab.command.simple;

/**
 * Oywayten 03.08.2023.
 */

public class GarageDoorOpenCommand implements Command {
    private final Door door;

    public GarageDoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
