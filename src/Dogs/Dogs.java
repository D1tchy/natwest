package Dogs;

public class Dogs {

	public static void whileLoop() {
		int dogs = 1;
		boolean notEnoughDogs = true;
		while (notEnoughDogs) {
			System.out.println("gimme a sloppy dog");
			dogs++;
			System.out.println("Dogs = " + dogs);
			if (dogs == 3) {
				notEnoughDogs = false;
			}	
		}

	}

	public static void doLoop() {
		int dogs =0;
		boolean notEnoughDogs =true;
		do {
			System.out.println(" sloppy dog");
			dogs++;
			System.out.println("dogs =" + dogs);
			if (dogs ==5) {
				notEnoughDogs = false;
			
			}
			
					}
		while (notEnoughDogs);
	}
}
