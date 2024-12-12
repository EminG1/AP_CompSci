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
		
	role = "Warrior";
	strength = 10;
	dexterity = 5;
	intelligence = 5;
	rizz = 5;
	
	}

public void getCharacter(){
	System.out.println("You are a " + role);
	System.out.println("You have " + strength + " strength points");
	System.out.println("You have " + dexterity + " dexterity points");
	System.out.println("You have " + intelligence + " intelligence points");
	System.out.println("You have " + rizz + " rizz points");

	
}
}

