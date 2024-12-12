/*
 *	Author:  Emin Gharibian
 *  Date: 9/11/24
	Collaborators: Giorgio Banna
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Choose 2 numbers please ");
	double y = sc.nextDouble();
	double x = sc.nextDouble();
	System.out.println("Sick here is the max of those two numbers ");
	double max = Math.max(x,y);
	System.out.println(max);
	System.out.println("Here is the square root of your second number ");
	double sqrt = Math.sqrt(y);
	System.out.println(sqrt);
	System.out.println("Here is your first number to the power of your second number");
	double pow = Math.pow(x,y);
	System.out.println(pow);
	
	}
}
