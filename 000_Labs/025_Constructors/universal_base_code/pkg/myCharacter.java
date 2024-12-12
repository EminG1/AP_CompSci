/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int rizz;

public myCharacter() {
		
	role = "no role";
	strength = 10;
	dexterity = 5;
	intelligence = 5;
	rizz = 5;
	
	}
	
public myCharacter(String r){
	role = r;
}

public void changeRole(String r){
	if (r.equals("Wizard") || r.equals("wizard")){
		role=r;
			System.out.println("You've chosen the Wizard! Excelsior!");
	}
	else if (r.equals("Warrior") || r.equals("warrior")){
		role=r;
			System.out.println("You've chosen the Warrior! For honor!");
	}
	else if (r.equals("Rogue")||r.equals("rogue")){
		role=r;
			System.out.println("You've chosen the Rogue! How cunning!");
	}		
	else 
			System.out.println("You've decided not to chose a role. Rerun program.");
	
}

public void getCharacter(){
	System.out.println("You are a " + role);
	System.out.println("You have " + strength + " strength points");
	System.out.println("You have " + dexterity + " dexterity points");
	System.out.println("You have " + intelligence + " intelligence points");
	System.out.println("You have " + rizz + " rizz points");

	
}
}

