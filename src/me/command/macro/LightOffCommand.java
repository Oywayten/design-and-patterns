package me.command.macro;

/**
 * Oywayten 03.08.2023.
 */

public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}