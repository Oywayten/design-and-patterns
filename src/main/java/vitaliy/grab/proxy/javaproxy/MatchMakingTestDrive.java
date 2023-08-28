package vitaliy.grab.proxy.javaproxy;

import java.lang.reflect.*;
import java.util.*;
import java.util.function.Supplier;

public class MatchMakingTestDrive {
    HashMap<String, Person> datingDB = new HashMap<>();

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive() {
        Person joe = getPersonFromDatabase("Joe Javabean");
        OwnerInvocationHandler joeOwnerInvocationHandler = new OwnerInvocationHandler(joe);
        Person ownerProxy = getProxy(joeOwnerInvocationHandler, joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());
        NonOwnerInvocationHandler joeNonOwnerInvocationHandler = new NonOwnerInvocationHandler(joe);
        Person nonOwnerProxy = getProxy(joeNonOwnerInvocationHandler, joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }

    Person getProxy(InvocationHandler handler, Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler);
    }

    Person getPersonFromDatabase(String name) {
        return (Person) datingDB.get(name);
    }

    void initializeDatabase() {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
