/*
 *	Author: Emin Gharibian
 *  Date: 9/26/24
 * 	Collaborator: Giorgio Banna
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

System.out.print("Please enter 2 integers: ");
	int a = sc.nextInt();
	int b = sc.nextInt();

	int c = a%2;
	int d = b%2;

	if (c==0)
		System.out.println(a+" is a even number");
	else if (c!=0)
		System.out.println(a+ " is a odd number");
	if (d==0) 
		System.out.println(b+ " is a even number");
	else if (d!=0)
		System.out.println(b+ " is a odd number");
		
	int e = a%3;
	int f = a%4;
	int g = a%5;
	
	int h = b%3;
	int i = b%4;
	int j = b%5;
	
	if (e==0)
		System.out.println(a + " is divisble by 3");
	else if (e!=0)
		System.out.println(a + " is not divisible by 3");
	if (f==0)
		System.out.println(a + " is divisble by 4");
	else if (f!=0)
		System.out.println(a + " is not divisible by 4");
	if (g==0)
		System.out.println(a + " is divisble by 5");
	else if (g!=0)
		System.out.println(a + " is not divisible by 5");
		
	if (h==0)
		System.out.println(b + " is divisble by 3");
	else if (h!=0)
		System.out.println(b + " is not divisible by 3");
	if (i==0)
		System.out.println(b + " is divisble by 4");
	else if (i!=0)
		System.out.println(b + " is not divisible by 4");
	if (j==0)
		System.out.println(b + " is divisble by 5");
	else if (j!=0)
		System.out.println(b + " is not divisible by 5");
	}
}
