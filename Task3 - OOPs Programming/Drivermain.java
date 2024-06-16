package Task3;

import java.util.Scanner;

public class Drivermain {
 public static void main(String arg[]) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println(" Enter empID:");
	 int empID = scanner.nextInt();
	 scanner.nextLine();
	 System.out.println("Enter Employee Name:");
	 String empName = scanner.next();
	 System.out.println("Enter Employee Salary:");
	 double empSalary = scanner.nextDouble();
	 
	 Employee employee = new Employee( empID, empName, empSalary);
	 employee.calTax();
	 
	 System.out.println("Enter unit price of the product:");
	 double unitprice = scanner.nextDouble();
	 
	 double salesTax = unitprice * Taxable.salesTax;
	 System.out.println("salesTax of product =" + salesTax);
	 
 
 }


}
