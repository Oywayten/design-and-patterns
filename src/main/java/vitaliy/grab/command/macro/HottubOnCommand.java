package vitaliy.grab.command.macro;

/**
 * Oywayten 04.08.2023.
 */

public class HottubOnCommand implements Command {

    private final Hottub hottub;
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }
}
