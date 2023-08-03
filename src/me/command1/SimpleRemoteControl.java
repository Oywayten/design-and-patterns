package me.command1;

/**
 * Oywayten 02.08.2023.
 */

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
