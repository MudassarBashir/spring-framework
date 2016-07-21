package com.caveofprogramming.spring.test;

public class Person {

	private int id;
	private String name;
	private int taxId;

	private Address address;

	public Person() {
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Creating person using factory method.");
		return new Person(id, name);
	}

	public Person(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void onCreate() {
		System.out.println("Person created: " + this);
	}

	public void onDestroy() {
		System.out.println("Person destroyed.");
	}

	public void speak() {
		System.out.println("Hello! I'm a person.");
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", taxId=" + taxId +
				", address=" + address +
				'}';
	}
}
