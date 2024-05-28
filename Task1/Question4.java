package Task1;

import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize the array elements
		int [] numbers = {45,789,21,};
		
		//initialize the minimum value with first elements of array
		int MinValue = numbers[0];
		
		for(int i=1; i< numbers.length; i++){
			if(numbers[i]< MinValue) {
				MinValue = numbers[i];
						
			}
		}
			
		{
			System.out.println("The Smallest Number is:"+ MinValue);
		
	}

	}}

