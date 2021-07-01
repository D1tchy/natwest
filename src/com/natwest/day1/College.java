package com.natwest.day1;

public class College {
	static int physics = 50;
	static int chem = 150;
	static int biology = 150;

	public static int totalMarks() {
		System.out.println("physics mark" + physics);
		System.out.println("biology mark" + biology);
		System.out.println("chem mark" + chem);
		return physics + chem + biology;
	}

	public static int percentage() {
		int percentage = totalMarks() * 100 / 450;
		return percentage;
	}
}
