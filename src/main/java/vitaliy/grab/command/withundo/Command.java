package vitaliy.grab.command.withundo;

/**
 * Oywayten 02.08.2023.
 */

interface Command {
    void execute();

    void undo();
}
