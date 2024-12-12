/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a random number between 1-1000: ");
		int a = sc.nextInt();
		int b=(int)(Math.random()*1000)+1;
	if (a==b)
		System.out.print(" you guessed the correct number. " + a + "is equal to "+ b);
	
	else if (a!=b) 
		System.out.print(" your guessed number was wrong");

	}
}
