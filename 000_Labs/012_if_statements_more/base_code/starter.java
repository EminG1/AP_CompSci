/*
 *	Author:  Emin Gharibian
 *  Date: 09/17/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Choose two numbers ");
	int a = sc.nextInt();
	int b = sc.nextInt();

	if (a!=b){
	System.out.println("They are different numbers");
	}
	if (a==b){
	System.out.println("They are the same number");
	}
	}
}
