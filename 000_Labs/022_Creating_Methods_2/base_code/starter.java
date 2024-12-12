/*
 *	Author:  Emin Gharibian
 *  Date: 10/8/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int x, int y){
		
		int count = 0;
		int z =x;
		while(count<y-1){
			x=z*x;
			count = count +1;
			}
			
	int num=x;
		return num;
	}
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your base number");
		int x = sc.nextInt();
	System.out.println("Please enter your exponent");
		int y = sc.nextInt();
	
		int num = pow(x,y);
	System.out.println("Here is your answer: "+ num);
	
	}
}
