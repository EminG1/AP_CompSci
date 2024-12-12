/*
 *	Author:  Emin Gharibian
 *  Date: 09/24/24
	Collaborators: Giorgio Banna
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("What is your name? ");
		String a = sc.nextLine();

	System.out.println(" ");
	System.out.print("What is your title? Ex: Slayer of Dragons ");
		String b = sc.nextLine();

	System.out.println(" ");
	System.out.print("Would you like to be a Wizard, Warrior, or Rogue? ");
		String c = sc.nextLine();
		
		
			if (c.equals("Wizard") || c.equals("wizard"))
				System.out.println("You've chosen the Wizard! Excelsior!");
		
			else if (c.equals("Warrior") || c.equals("warrior"))
				System.out.println("You've chosen the Warrior! For honor!");
			
			else if (c.equals("Rogue")||c.equals("rogue"))
				System.out.println("You've chosen the Rogue! How cunning!");
			
			else  
				System.out.println("You've decided not to chose a role. Rerun program.");

	System.out.println(" ");
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	System.out.println(" ");
	System.out.println("Strength (1-10): ");
		int d = sc.nextInt();
		int e = 20-d;
		
			if(d<=10){
				System.out.println("You have "+ e + " left to spend.");
			}
			else if (d>10)
			{
				System.out.println("You have went over the limit of 10 points per skill, rerun the program");
			}
	System.out.println(" ");
	System.out.println("Dexterity (1-10): ");
		int f = sc.nextInt();
		int g = e-f;
			if(f<=10){
				System.out.println("You have "+ g + " left to spend.");
			}
				else if (f>10)
			{
			System.out.println("You have went over the limit of 10 points per skill, rerun the program");
			}
	System.out.println(" ");
	System.out.println("Intelligence (1-10): ");
		int h = sc.nextInt();
		int x = g-h;
			if(h<=10){
				System.out.println("You have "+ x + " left to spend.");
			}
			else if(h>x){
				System.out.println("You don't have enough points, rerun the program");
			}
			else if(h>10)
			{
			System.out.println("You have went over the limit of 10 points per skill, rerun the progra");
			}
	System.out.println(" ");
	System.out.println("Charisma (1-10): ");
		int y = sc.nextInt();
		int j = x-y;
		
		if(y>10)
				System.out.println("You have went over the limit of 10 points per skill, rerun the program");

		if(y>j)
				System.out.println("You don't have enough points, rerun the program");
	System.out.println(" ");

			if (j==0)
				System.out.println("You used all your points good job :)");
			else if (j!=0)
				System.out.println("You didn't use up all your points, you have " + j + " points left");

	System.out.println(" ");
	System.out.println("--------------------------------------------------");
	System.out.println(" ");

	System.out.println("You are "+ a + " the "+ b + " from the tribe of the " + c + ", with the stats of:");
	System.out.println("Strength - "+ d);
	System.out.println("Dexterity - " +f);
	System.out.println("Intelligence - " + h);
	System.out.println("Charisma - " + y);

		
	}
}
