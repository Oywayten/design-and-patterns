package vitaliy.grab.adapter;

/**
 * Oywayten 05.08.2023.
 */

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        testTurkey(turkey);
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
        Turkey duckAdapter = new DuckAdapter(duck);
        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
