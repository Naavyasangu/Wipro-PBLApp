//Write a program to initialize an array and print them in a sorted order.

import java.util.Arrays;

public class Assignment06 {

	public static void main(String[] args) {
		
		int[] array = {19, 14, 20, 18, 2};
		
		Arrays.sort(array);												
		
		System.out.print("Sorted Array : ");
		for(int element : array) {
			System.out.print(element + " ");
		}
	}

}