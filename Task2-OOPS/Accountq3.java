package Task2;

public class Accountq3 {

	private double balance;
	
	public Accountq3 () {
		this.balance = 0.0;
	}
	
	public Accountq3(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double Amount) {
		if(Amount > 0) {
			this.balance+=Amount;
			System.out.println("Successfully deposited " + Amount);
		}
		else {
			System.out.println("Deposit not processed");
		}
	}
	public void withdraw( double Amount) {
		if(Amount >0) {
			if(Amount <= this.balance) {
				this.balance -= Amount;
				System.out.println("Successfully Withdrawn "+ Amount);
				} else {
					System.out.println("Insufficient Balance!!! Withdrawn is not processed");
				}
		}
	}
	public void displaybalance() {
		
		System.out.println("Available Balance : "+ this.balance);
	}
	
	public static void  main(String args[]) {
		Accountq3 object = new Accountq3();
		object.displaybalance();
		
		object.deposit(5000);
		object.displaybalance();
		
		object.withdraw(600);
		object.displaybalance();
			
		
	}
	}

