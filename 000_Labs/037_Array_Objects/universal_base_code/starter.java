/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
	Wizard[] wiz = new Wizard [100];
	Warrior[] wari = new Warrior [100]; 
	
	for(int i = 0; i<wari.length; i++){
		wari[i] = new Warrior();
	}
	for(int i = 0; i<wiz.length; i++){
		wiz[i] = new Wizard();
	}	
	
	
	int wariCount = 100;
	int wizCount = 100;


	int wariIndex = 0;
	int wizIndex = 0;

	while (wariIndex < wari.length && wizIndex < wiz.length) {
	
	wiz[wizIndex].attack(wari[wariIndex]);
	if (wari[wariIndex].isDead()) {
		wariIndex++;
		wizCount--;
	}
	if (wariIndex < wari.length) 
	wari[wariIndex].attack(wiz[wizIndex]);
	if (wiz[wizIndex].isDead()) {
		wizIndex++;
		wariCount--;
	}
			

	
}

	if (wariIndex>wizIndex){
		System.out.println("Warrior's won with "+ wariCount + " troops left");
	}
	if (wariIndex<wizIndex){
		System.out.println("Wizards's won with "+ wizCount + " troops left");
	}
			
	
	
	
	
	}
}
