package me.command.macro;

/**
 * Oywayten 04.08.2023.
 */

public class HottubOffCommand implements Command {

    private final Hottub hottub;
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }
}
