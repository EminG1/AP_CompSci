/*
 *	Author: Emin Gharibian
 *  Date: 10/1/24
 * 	Collaborator(s): Giorgio
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Slot Machine Rules: ");
	System.out.println("1. Each player starts with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("   a. If two numbers match, you double your money.");
	System.out.println("   b. If three numbers match, you triple your money.");
	System.out.println("   c. If none match, you lose your money.");
	System.out.println("--------------------------------------------------");

	int money = 100;
	
	while(money>0){
		
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n): ");
		String a = sc.nextLine();
		
		if(a.equals("no")||a.equals("No")||a.equals("N")||a.equals("n")){
			System.out.println("Sorry to see you go :(, you have "+ money+ "$ left");
			break;
		}
		else if(a.equals("yes")||a.equals("Yes")||a.equals("y")||a.equals("Y")){
		System.out.println("You have " + money+ "$ how much would you like to gamble? ");
		}
			
		else{
			System.out.println("Please enter a vaid answer (Yes/yes/Y/y) or (No/no/N/n):");
			a = sc.nextLine();
		}
			
			
		System.out.println("Please enter the amout you want to gamble");
		int wager = sc.nextInt();
			sc.nextLine();
		if (wager>money||wager<=0){
			System.out.println("Please enter a valid number");
			wager = sc.nextInt();
		}	
		
		System.out.println("Great! Let's play!!!");
		System.out.println("Your rolls are: ");
		int one = (int)(Math.random()*10)+1;
		int two = (int)(Math.random()*10)+1;
		int three = (int)(Math.random()*10)+1;
		System.out.println("________________");
		System.out.println (" | "+ one + " | "+ two + " | "+ three+ " | ");
		System.out.println("________________");
		System.out.println(" ");

	if(one==two || one == three || three==two){
		money = money + (wager *2);
		System.out.println("Great you doubled your wager");
	}
	
	else if (one==two && two == three){
		money = money + (wager *3);
		System.out.println("Great you tripled your wager");
	}
	if(one!=two || one != three || three!=two){
		money = money - wager;
	}
	
	
	if(money==0){
		System.out.println("Good job you lost all your money and your mortgage is due tommorow :)");	
			break;
	}
			
	System.out.println("You now have " + money +"$");
	
	}
	}
}
