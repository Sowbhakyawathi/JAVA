package Task3;

public class Employee implements Taxable {
private int empID;
private String name;
private double salary;
public Employee(int empID, String name, double salary) {
	super();
	this.empID = empID;
	this.name = name;
	this.salary = salary;
}
 
public void calTax() {
	double incomeTax = salary* Taxable.incomeTax;
	System.out.println("Income Tax of Employee:" + name+ incomeTax);
	
		}
}
