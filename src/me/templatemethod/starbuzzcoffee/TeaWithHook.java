package me.templatemethod.starbuzzcoffee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Oywayten 06.08.2023.
 */

public class TeaWithHook extends CaffeineBeverage {

    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    protected void brew() {
        System.out.println("Steeping the tea");
    }

    protected boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.print("Would you like lemon with your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}