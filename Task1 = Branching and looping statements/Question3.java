package Task1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 875, reverse =0;
		for(; num!=0; ) 
		{			
			int Remainder = num%10;
			reverse = reverse *10 + Remainder;
			num = num/10;
			}
		System.out.println("The reverse of the given number is:"+ reverse);

	}

}
