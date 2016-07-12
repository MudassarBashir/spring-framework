package com.caveofprogramming.spring.test;

public class Person {

	private int id;
	private String name;

	public Person() {
	}

	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void speak() {
		System.out.println("Hello! I'm a person.");
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
