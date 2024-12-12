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
	
	System.out.println("Enter your pet peeve. ");
	String a = sc.nextLine();
	
	String b = "Did you just say \"";
	String c = "\" is your pet peeve? \n Wow how dare you. \\ \\ Get out of here!";
		
	System.out.println(b+a+c);
	}
}
