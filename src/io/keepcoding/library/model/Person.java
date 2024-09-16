package io.keepcoding.library.model;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public void showInfo() {
		System.out.println("Contact info: \n"
		+ " Name: " + name
		+ " Age: " + age
		+ " Address: " + address); 
	}
}
