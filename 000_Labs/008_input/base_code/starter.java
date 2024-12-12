/*
 *	Author:  Emin Gharibian
 *  Date: 9/11/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Please enter your name: ");
	String name = sc.nextLine();
	System.out.println("Please enter your age");
	int age = sc.nextInt();
	sc.nextLine(); 
	System.out.println("Please enter your birth month");
	String month = sc.nextLine(); 
	System.out.println("Please enter your birth day");
	int day = sc.nextInt();
	sc.nextLine(); 
	System.out.println("Please enter your birth year");
	int year = sc.nextInt();
	sc.nextLine(); 
	System.out.println("Final question, how much is a buck fifty?");
	double buck = sc.nextDouble();
	sc.nextLine(); 
	//buck = Math.round(buck *100.0)/100.0;
	System.out.println("So, " + name + " you are " + age + " years old and was born on " + month + " " + day + " " + year + " therefore, having a total value of " + "$" + buck);
	
	}
}
