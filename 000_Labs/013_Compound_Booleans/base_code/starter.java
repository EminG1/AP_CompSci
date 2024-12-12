/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter 3 integers you want to compare: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

	if (a>b && a>c){
		System.out.print(a+ " is the largest number");
	}
	if (b>a && b>c){
		System.out.print(b+ " is the largest number");
	}
	if (c>b && c>a){
		System.out.print(c+ " is the largest number");
	}
	
	if (a<b && a<c){
		System.out.print(" and " + a+ " is the smallet number");
	}
	if (b<a && b<c){
		System.out.print(" and "+b+ " is the smallest number");
	}
	if (c<b && c<a){
		System.out.print(" and "+c+ " is the smallest number");
	}
	}
}
