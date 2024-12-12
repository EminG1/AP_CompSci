/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
		myCharacter strong = new myCharacter();
		strong.getCharacter();
		System.out.println("Choose what role you would like to be: ");
				String r = sc.nextLine();
		strong.changeRole(r);
		System.out.println("--------------------------------------");
		strong.getCharacter();



	}
}
