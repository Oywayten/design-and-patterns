package me.command1;

/**
 * Oywayten 02.08.2023.
 */

public class RemoteControlTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(() -> System.out.println("foo bar"));
        remote.buttonWasPressed();
        Door door = new Door();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
