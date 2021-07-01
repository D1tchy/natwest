package com.oop.encapsulation;

import java.util.ArrayList;

public class Runner {

	
	
	public static void main(String[] args) {
//		object 
		Person Kim = new Person ("kim", 21, "doesnt know anything");
		Person Jack = new Person ("Jack",20, " Genious");
		Person Tomas = new Person ("Tomas", 18, "lodger");
		System.out.println(Kim.toString());
		
		ArrayList<Person> people = new ArrayList<>();
		people.add(Kim);
		people.add(Jack);
		people.add(Tomas);
		System.out.println(people);
		
	}
	
	

	}


