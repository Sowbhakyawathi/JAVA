package Task2;

public class Employeeq4 extends Personq4 {

	private int EmployeeID;
		private double salary;
	
		public Employeeq4(String name, int age, int employeeID, double salary) {
		super(name, age);
		this.EmployeeID = employeeID;
		this.salary = salary;
	}
		public int getEmployeeID() {
			return EmployeeID;
		}
		
		public double getSalary() {
			return salary;
		}
		public static void main(String arg[]) {
			Employeeq4 Employee = new Employeeq4("ABC",45,101,50000);
			
			System.out.println("Employee Name :"+ Employee.getName());
			System.out.println("Employee Age :"+Employee.getAge());
			System.out.println("Employee ID :"+ Employee.getEmployeeID());
			System.out.println("Employee Salary :"+ Employee.getSalary());
		}
}
