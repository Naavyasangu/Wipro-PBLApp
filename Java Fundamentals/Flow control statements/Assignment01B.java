/* Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.

lastDigit(7, 17) -> true
lastDigit(6, 17) -> false
lastDigit(3, 113) -> true
*/

import java.util.*;
class Assignment01B
{
  public static void main(String args[])
  {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two numbers:");
     num1=sc.nextInt();
     num2=sc.nextInt();
	if(num1%10==num2%10)
	{
		System.out.println("Last Digits Are Equal.");
	}
	else
	{
		System.out.println("Last Digits Are Not Equal.");
	}
  }
}