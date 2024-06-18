package Task4;

public class Voter {
	private int voterID;
	private String name;
	private int age;

	public Voter(int voterID, String name, int age) {
		super();
		this.voterID = voterID;
		this.name = name;
		this.age = age;
	}

	public int getVoterID() {
		return voterID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void validage(int age) throws InvalidageException {
		if (age < 18) {
			throw new InvalidageException(age);
		} else {
			System.out.println("Eligible");
		}
	}

	public static void main(String arg[]) {
		try {
			validage(12);
		} catch (InvalidageException e) {
			System.out.println(e.getMessage());
		}
	}
}
