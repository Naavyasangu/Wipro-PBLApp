/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java Sample 10 20
O/P Expected : The sum of 10 and 20 is 30
*/

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		int sum = x + y;
		
		System.out.println("The sum of "+x+" and "+y+" is "+sum);
	}

}