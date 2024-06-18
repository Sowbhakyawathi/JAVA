package Task4;

public class InvalidageException extends Exception {
	InvalidageException(int age) {
		super("invalid age for voter");
	}
}
