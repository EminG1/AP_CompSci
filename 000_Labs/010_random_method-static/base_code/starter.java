/*
 *	Author:  Emin Gharibian	
 *  Date: 09/16/24
	Collaborator: Giorgio
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("here are 4 random numbers between int 0-9 inclusive of both, int 1-100 inclusive of both, double 2.5-3.5 inclusive of 2.5 and a double 14-589 inclusive of 14: ");
		//int a = sc.nextInt();
		//System.out.print("Choose a other random number: ");
		//int b = sc.nextInt();
		//int c = Math.max(a,b);
		//int d = Math.min(a,b);
		int num = (int)(Math.random()*9);
		int bum = (int)(Math.random()*99) + 1;
		double tum = (Math.random()*1) + 2.5;
		double drum = (int)(Math.random()*575) + 14;
		//int run = (int)(Math.random()*c) + d;
		System.out.println( num+", " +bum+", "+tum +","+drum+",");
		
	}
}
