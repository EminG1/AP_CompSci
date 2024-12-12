/*
 *	Author: Emin Gharibian		
 *  Date: 09/18/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number 1-7 for any day for Sunday-Saturday: ");
	int a = sc.nextInt();
	
	int sunday = 1;
	
	if(a==1){
		System.out.println("It's Sunday at 10:00 am, wake up big man your gonna be late for church");
	}
	if(a==2){
		System.out.println("It's Monday at 7:00 am bruh, you got work/school :(");
	}
	if(a==3){
		System.out.println("It's Tuesday at 7:00 am, today is lowkey just a cut scene");
	}
	if(a==4){
		System.out.println("It's Wednesday at 7:00 am, halfway through the week :)");
	}
	if(a==5){
		System.out.println("It's Thursday at 7:00 am, one more day till Firday");
	}
	if(a==6){
		System.out.println("It's finally Friday, but you still gotta wake up at 7:00am");
	}
	if(a==7){
		System.out.println("Andddd it's Saturday, you can sleep in now");
	}
	}
	
}
