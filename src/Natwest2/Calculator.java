package Natwest2;

public class Calculator {
//	Create a method that accepts two integers as input, 
//	then returns an integer that is the sum of these two parameters. 
//	(Addition)
//	Create the following additional 
//	three methods that each take two parameters:
//	Multiplication - which takes two numbers and returns the product.
	// Subtraction - which takes two numbers,
//		then returns the result of the subtraction.
//	Division - which takes two numbers, then returns the result of the division.
	// Your division method may have returned the wrong result;
//	This is called a rounding error and is quite common in most languages. 
//	this is because we were using ints rather than doubles. 
//	Modify the division method so that it takes Double parameters and then return a Double, 
//	Edit the division method in the Calculator class,
//	the sum should only execute if the first parameter is smaller than the second, 
//	otherwise it prints out a message saying that the division cannot be performed.
//	if not already.

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public static int mul(int a, int b) {
		int c = a * b;
		return c;
	}

	public static double div(double a, double b) {
		double c = 0;
		if (a < b) {
			c = a / b;
		} else {
			System.out.println("divi cannot be performed");

		}
		return c;
	}

	public static int remainder(int a, int b) {
		int c = a % b;
		return c;
	}

	public static int oddeven(int a) {
		int c = a % 2;
		if (c == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		return c;
	}

	public static int Even(int a) {
		int c = a % 2;
		if (c == 4) {
			System.out.println("odd");
		}

		else {
			System.out.println("even");

		}
		return c;
	}
}
