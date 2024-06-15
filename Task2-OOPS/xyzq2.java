package Task2;

import java.util.Scanner;

public class xyzq2 {

	public static productq2[] productinfo()
	{
		Scanner scanner = new Scanner(System.in);
		productq2[] arrayproducts = new productq2[5];
		 System.out.println("Enter the product information:");
		 
		for (int i=0; i<5; i++) {
			System.out.printf("Product %d:\n", i + 1);
			System.out.println("Pid :");
			int pid = scanner.nextInt();
			System.out.println("price :");
			double price = scanner.nextDouble();
			System.out.println("quantity:");
			int quantity = scanner.nextInt();
			
			arrayproducts[i] = new productq2(pid, price, quantity);
			        
	    }
		return arrayproducts; 	 	

}	
	public static int findpidwithhighestprice(productq2[] arrayproducts) {
		double maxprice = Double.MIN_VALUE;
		int pid = -1;
		for (productq2 object:arrayproducts) {
			if ( object.getPrice()>maxprice){
				maxprice = object.getPrice();
				pid = object.getPid();
			}
		}
		return pid;
	}	
	public static double calculatethetotalamount(productq2[] arrayproducts) {
		double totalamount  = 0.0;
		
		for (productq2 object : arrayproducts) {
			totalamount += object.getPrice() * object.getQuantity();
		}
		return totalamount;
	}
		
	public static void main(String[] arg) {
		
		productq2[] arrayproducts = productinfo();
				
		int pidhighestprice = findpidwithhighestprice( arrayproducts);
		System.out.println("Find PID of the highest price:" + pidhighestprice );
		
		double totalamount = calculatethetotalamount(arrayproducts);
		System.out.println("Total Amount on single products : "+ totalamount );
				
	}
	
	
}
