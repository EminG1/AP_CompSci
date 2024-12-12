/*
 *	Author: Emin Gharibian
 *  Date: 10/10/24
*/

import java.util.Scanner;

class starter {

	public static boolean checkPrimes(int a){
		
	if (a<=0){
		return false;
	}
	int count = 2;
	while (count<=a/2){
		if(a%count == 0){
			return false;
		}
		count++;
	}
		return true;
	}

	public static void printPrimes(int a){

	int count =2;
	while(count<a){
		if(checkPrimes(count)){
			System.out.println(count);
	}
	count++;
	}
}

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Input a number and we'll print out every prime until that number: ");
		int a = sc.nextInt();
	printPrimes(a);
	
	}
}
