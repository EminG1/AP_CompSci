/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your name: ");
		String a = sc.nextLine();
	
	System.out.println("How many times would you like this name to be repeated?: ");
		int b = sc.nextInt();
	
	int c = 0;
	
	while(c<b){
	System.out.println(a);
	c=c+1;
	}
	}
}
