/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

	int [] arr = new int [20];
	
	System.out.println("----------------------------------------------------");
	System.out.println("These are the 20 numbers");
	
	for(int c = 0; c<arr.length; c++){
		arr[c] = (int)(Math.random()*9)+1;
		System.out.print(arr[c]+ " ");
	}
	System.out.println(" ");
	System.out.println("----------------------------------------------------");

	int target = arr[(int)(Math.random()*9)+1];
	System.out.println("The random number to look for is "+ target);
			
			int counter = 0;

	for(int c = 0; c<arr.length; c++){
		if (target == arr[c]){
			System.out.println("Duplicate found at index " + c);
			counter++;
		}
	}
	
	System.out.println("Total number of duplicates for "+ target+ " is " +counter );
	System.out.println("----------------------------------------------------");
	System.out.println("Looking for two in a row: ");

	int dupe = 0;
	while(dupe < 19){
		if(arr[dupe]==arr[(dupe+1)]){
			System.out.println("Two in a row found at indexes " + dupe +" and " + (dupe+1) + " The number is "+ arr[dupe]);
		}
		dupe++;
	}
	
	}
}