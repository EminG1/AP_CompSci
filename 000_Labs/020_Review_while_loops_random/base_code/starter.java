/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number between 1-1000");
	int guess = sc.nextInt();
	
	int answer = (int)(Math.random()*999)+1;
	
	while(true){
			if(guess>answer)
				System.out.println("Guess lower");
		
			if (guess<answer)
			System.out.println("Guess higher");
			
			if(guess==answer)
			System.out.println("You got the correct number :)");
		
		guess = sc.nextInt();
		}
		
	}
}
