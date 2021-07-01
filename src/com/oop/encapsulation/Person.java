package com.oop.encapsulation;
//Create a Person class modelling name, age and job title variables.
//
//Create a method to return all three of these in a formatted string.
//
//HINT: @Override the toString() method.
//
//Create some example objects with this class.
//
//Create a List<> implementation and store those objects inside.
//
//HINT: it's probably best to put your List<> implementation in a separate class.

public class Person {
// constructor - initialise value when you call the class 
	public Person(String name, int age, String jobtitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobtitle = jobtitle;
	}
//variables . need data-type & variable name, access modifier is optional
	private String name;
	private int age;
	private String jobtitle;

	public String getName() {
		return name;
	}
	
	public void setName( ) {
	this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public void setName(String name) {
		this.name = name;
	}
// to-string - displays all the info in one line
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobtitle=" + jobtitle + "]";
	}	
	
	
	
}
