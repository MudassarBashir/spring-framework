package com.caveofprogramming.spring.test;

/**
 * Created by mbashir on 7/21/2016.
 */
public class PersonFactory {

    public Person createPerson(int id, String name) {
        System.out.println("Using factory object to create person.");
        return new Person(id, name);
    }
}
