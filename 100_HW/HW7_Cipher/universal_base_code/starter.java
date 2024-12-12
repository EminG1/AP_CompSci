/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a message you want to decipher: ");
		String a = sc.nextLine();
	
	String b = Cipher.encode(a); //for regular ones
	System.out.println(b);
	
	String c = Cipher.keyedEncode(a,33); //for number 4
	System.out.println(c);
	
	String d = Cipher.keyedEncode(b,8); // for number 6
	System.out.println(d);
	
	String e = Cipher.keyedEncode(d,13); //for number 7
	System.out.println(e);
	String f = Cipher.keyedEncode(e,29);
	System.out.println(f);
	
	String g = Cipher.keyedEncode(a,26); 
	System.out.println(g);

/*	String b = Cipher.encode(a);  // for second to last one
	System.out.println(b);
	
	String c = Cipher.keyedEncode(b,33); 
	System.out.println(c);
	
	String d = Cipher.keyedEncode(c,8); 
	System.out.println(d);
	
	String e = Cipher.keyedEncode(d,13); 
	System.out.println(e);
	String f = Cipher.keyedEncode(e,29);
	System.out.println(f); 
	*/
	}
}
