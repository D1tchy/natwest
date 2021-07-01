package com.natwest.day1;

public class Calculator {
	String str = "hi";
	boolean bool = true;
	long val = 2344222;
	static double dec = 4.5;
	float decSmall = 2.4f;
	char letter = 'a';

	public static void subtract() {
		System.out.println(3 - 2);
	}

	public static void add2() {
		System.out.println(3 + 2);

	}

	public static int multiply() {
		int x = 3;
		int y = 4;
		return x * y;
	}

	public static int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	public static int add1(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int multplication1(int a, int b) {
		int c = a * b;
		return c;
	}

	public static int subtraction1(int a, int b) {
		int c = a - b;
		return c;
	}

	public static double division(double a, double b) {
		if 
		
		
		double c = a / b;
		return c;
	}

	public double divide(double firstnumber, double secondnumber) throws ArithmeticException{
		
	
if (firstnumber ==0|| secondnumber ==0) {
	throw new ArithmeticException("SORRY CAN'T DEVIDE BY ZERO");
	
}
	}	
}
