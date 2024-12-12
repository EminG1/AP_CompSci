/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Choose a random number: ");
		int a = sc.nextInt();
		System.out.print("Choose a other random number: ");
		int b = sc.nextInt();
		int c = Math.max(a,b);
		int d = Math.min(a,b);
		int e = c-d;
		int num = (int)(Math.random()*e) + d;
		int bum = (int)(Math.random()*e) + d;
		int tum = (int)(Math.random()*e) + d;
		int drum = (int)(Math.random()*e) + d;
		int run = (int)(Math.random()*e) + d;
		System.out.print("here are 5 random numbers between " + d + " and " + c + ": "+ num+", " +bum+", "+tum +", "+drum+", "+run);
	}
}
