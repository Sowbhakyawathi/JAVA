package Task4;

public class AgeNotWithinRangeException extends Exception {

	AgeNotWithinRangeException(int age) {
		super("age of the student is not between 15 and 21 ");
	}
}
