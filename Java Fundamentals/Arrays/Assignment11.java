/*
Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) -> true
only14([1, 4, 2, 4]) -> false
only14([1, 1]) -> true
*/

import java. util. *;

class Assignment11

{

	public static void main ( String args [] )

	{

		Scanner sc = new Scanner ( System.in ) ;

		int i, k=0 ;

		int a [] = new int [4] ;

		System.out.println (" Enter the array elements ");

		for ( i=0;i<a.length;i++)

		{

			a [i] = sc.nextInt();

		}

		System.out.println ("The array elements are");

		for ( i=0;i<a.length;i++)

		{

			System.out.println ( a[ i ] + " " ) ;

		}
	
		// checking the elements

		for ( i=0;i<a.length;i++)

		{

			if ( a [ i ] == 1 || a [ i ] == 4 )

			k++;

		}

		if ( k == a.length )

			System.out.println (" True ");

		else

			System.out.println (" False ");

	}

}

