package com.caveofprogramming.spring.test;

/**
 * Created by mbashir on 7/15/2016.
 */
public class Address {

    private String street;
    private String zipCode;

    public Address() {
    }

    public Address(String street, String zipCode) {
        this.street = street;
        this.zipCode = zipCode;
    }

    public void init() {
       System.out.println("Bean created: " + this);
    }

    public void destroy() {
        System.out.println("Bean destroyed: " + this);
    }


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
