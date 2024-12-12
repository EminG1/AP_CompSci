/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
	String a = sc.nextLine();
	
	if (a.equals("Wizard") || a.equals("wizard"))
		System.out.print("You've chosen the Wizard! Excelsior!");
		
	if (a.equals("Warrior") || a.equals("warrior"))
		System.out.print("You've chosen the Warrior! For honor!");
	
	if (a.equals("Rogue") || a.equals("rogue"))
		System.out.print("You've chosen the Rogue! How cunning!");
	
	else 
		System.out.print("You've decided not to chose a role. Rerun program.");
	
	}
}
