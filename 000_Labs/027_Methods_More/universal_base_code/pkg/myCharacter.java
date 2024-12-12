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
	strength = 0;
	dexterity = 0;
	intelligence = 0;
	rizz = 0;
	
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

public int setStrength(int s){
	if(s>0){
	strength = s;
	return strength;
	}
	else 
	return strength = 0;
}

public int setDexterity(int d){
	if(d>0){
	dexterity = d;
	return dexterity;
	}
	else 
	return dexterity = 0;
}

public int setIntelligence(int i){
	if(i>0){
	intelligence = i;
	return intelligence;
	}
	else 
	return intelligence = 0;
}

public int setRizz(int c){
	if(c>0){
	rizz = c;
	return rizz;
	}
	else 
	return rizz = 0;
}

public boolean setAll(String r, int s, int d, int z, int i, int r){
	
	role = r;
	strength = s;
	dexterity = d;
	intelligence = i;
	rizz = r;
	return true;
}


}

