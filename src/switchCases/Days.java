package switchCases;

public class Days {
	public static String daysOfWeek(String today) {
		switch (today) {
		case "Monday":
			System.out.println("Mondays suck");
			break;
		case "Tuesday":
			System.out.println("Tuesday send me home");
			break;
		case "Wednesday":
			System.out.println("happy hump day");
			break;
		case "Thursday":
			System.out.println("nearly there");
			break;
		case "Friday":
			System.out.println("Angelsey time");
			break;
		case "Saturday":
			System.out.println("chill time");
			break;
		case "Sunday":
			System.out.println("Sunday should come with a pause buttoin");
			break;
		default:
			System.out.println("invalid option");
			break;

		}
		return null;
	}

}
