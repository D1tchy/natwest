package com.natwest.day1;

public class Exception {

	public double divide(double firstnumber, double secondnumber) throws ArithmeticException {

		if (firstnumber == 0 || secondnumber == 0) {
			throw new ArithmeticException("SORRY CAN'T DEVIDE BY ZERO");

		}
		return firstnumber / secondnumber;

	}

	public void checkNumbers(double firstnumber, double secondnumber) {
//		check if the firstnumber is a valid double number!
		try {
			Double.valueOf(firstnumber);

		} catch (NumberFormatException e) {
			System.out.println("the first number is:" + firstnumber);
		}
//		check if the secondnumber is a valid double number!

		try {
			Double.valueOf(secondnumber);
		} catch (NumberFormatException e) {
			System.out.println("second number is invalid" + e);
		} finally {
			System.out.println("the second number is" + secondnumber);
		}
		try {
			System.out.println(firstnumber + "/" + secondnumber + "=" + divide(firstnumber, secondnumber));
		} catch (ArithmeticException e) {
			System.out.println("its ballsed up" + e.getMessage());
		}
	}
}