package Task4;

public class NameNotValidException extends Exception {
	NameNotValidException(String Name) {
		super("a name contains numbers or special symbols");
	}
}