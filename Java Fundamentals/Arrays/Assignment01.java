//Write a program to initialize an integer array and print the sum and average of the array.

import java.util.Arrays;

public class Assignment01 {

	public static void main(String[] args) {
		
		int[] array = {19, 14, 20, 18, 2};
		int sum = 0;
		
		System.out.println("Array: "+Arrays.toString(array)); 						
		
		for(int i = 0; i < array.length; i++) {										
			sum = sum + array[i];
		}
		System.out.println("The sum of the array is: "+sum);
		double avg = (sum/array.length);											
		System.out.println("The average of the array is: "+avg);	
	}

}