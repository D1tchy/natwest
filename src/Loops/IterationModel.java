package Loops;

public class IterationModel {
	public static void flow1() {
		int A = 100;
		while (A <= 200) {
			System.out.println("the value of  A is" + A);
			A++;
			System.out.println("A has reached" + A + "We've reached the end");

		}
	}

	public static void flow2() {
		int A = 100;
			while (A % 2 == 0) {
			System.out.println("-");
			A++;
			System.out.println("The value of A is even, print *" + A);
			 {
					
				System.out.println("the Value of A is odd , print * "+ A);
			}
		}
	}
}

