package vitaliy.grab.command.macro;

/**
 * Oywayten 04.08.2023.
 */

public class TVOffCommand implements Command {

    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
