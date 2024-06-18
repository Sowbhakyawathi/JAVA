package Task4;

import java.util.Scanner;

public class weekdayspgm {
	public static void main(String arg[]) {
		String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter day position (0-6): ");
		int dayIndex = scanner.nextInt();

		try {
			String dayName = getDayName(weekdays, dayIndex);
			System.out.println("The day at position " + dayIndex + " is: " + dayName);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Day index is out of range (0-6). Please enter a valid index.");
		}
	}

	public static String getDayName(String[] weekdays, int index) throws ArrayIndexOutOfBoundsException {

		if (index < 0 || index >= weekdays.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return weekdays[index];
	}
}
