package Task1;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	// Create the scanner object
	Scanner scanner = new Scanner(System.in);
	// enter the user output
	System.out.println("Enter the no of rows:");
	int n = scanner.nextInt();
	scanner .close();
	
	//outer loop for no of rows
	for(int i=1; i<=n; i++) {
		// inner loop for printing values
		for(int j=1; j<=n; j++) {
			//calculate the value
			int value = Math.max(n-i+1, n-j+1);
			System.out.print(value + " ");
		}
		// got to next line
		System.out.println();
				
	}
	}

}
