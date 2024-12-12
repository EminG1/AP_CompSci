/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Name your dog");
		String n = sc.nextLine();

	System.out.println("How old is "+ n);
		int a = sc.nextInt();
	
	Dog doggo = new Dog(n,a);
		
	System.out.println(doggo.getName() + " is a "+ doggo.getBreed() + " who is "+ doggo.getAge()+ " years old");	
	

	Dog max = new Dog("Max", "Golden Retriever");
	
	System.out.println("Max is a 1 year old Golden Retriever");

	if(max.isSleeping() && doggo.isSleeping())
		System.out.println("Max and "+ doggo.getName() + " are both asleep");
		
	else if (!max.isSleeping() && doggo.isSleeping())
		System.out.println(doggo.getName() + " wakes up from Max's bark and barks");
		
	else if (max.isSleeping() && !doggo.isSleeping())
		System.out.println(doggo.getName() + " barks and wakes up Max and barks");
		
	else 
		System.out.println(doggo.getName()+ " and Max are both awake and bark");


}
}
