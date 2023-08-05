package me.command2withundo;

/**
 * Oywayten 02.08.2023.
 */

interface Command {
    void execute();

    void undo();
}
