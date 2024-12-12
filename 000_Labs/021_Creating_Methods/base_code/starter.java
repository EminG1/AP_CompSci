/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void toString(String a, String b){
		System.out.println("This was done using methods");
		System.out.println(a);
		System.out.println(a +" "+ b);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence");
			String a = sc.nextLine();
		System.out.println("Write another sentence");
			String b = sc.nextLine();
		
		toString(a,b);
	}
}
