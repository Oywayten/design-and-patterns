package vitaliy.grab.swingobserver;

import javax.swing.*;

/**
 * Oywayten 23.07.2023.
 */

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");
        frame.setBounds(40, 90, 85, 20);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        button.addActionListener(angel -> System.out.println("Don't do it, you might regret it"));
        button.addActionListener(devil -> System.out.println("Come on, fo it!"));
    }
}
