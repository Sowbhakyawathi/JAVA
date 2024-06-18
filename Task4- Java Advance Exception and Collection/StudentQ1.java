package Task4;

public class StudentQ1 {
	private int rollno;
	private String name;
	private int age;
	private String course;
	private char[] getName;
	public StudentQ1(int rollno, String name, int age, String course)   {
		super();
		this.rollno = rollno;
		this.course = course;
		
		this.age = age;
		
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public static void validage(int age) throws AgeNotWithinRangeException {
	if(!(age>15 && age<21)) {
		throw new AgeNotWithinRangeException(age);
		}else {
			System.out.println("Age Valid");
		}
		}
	public static void validname(String name, boolean validname) throws NameNotValidException {
		 		
		if(!(validname)) {
			throw new NameNotValidException(name);
			}else {
				System.out.println("Name Valid");
			}
	}
	public static void main(String arg[]) {
		try {
			validage(22);
			}catch(AgeNotWithinRangeException e) {
				System.out.println(e.getMessage());
				
		}	try {
			validname("sow", true);
			}catch(NameNotValidException e) {
				System.out.println(e.getMessage());
				
		}
		
		
	}
	
}













