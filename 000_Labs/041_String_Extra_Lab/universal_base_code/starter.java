/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a sentence: ");
    String sentence = sc.nextLine();
    String first = "";
    String result = "";
    String last = "";

    while(true){
        if(sentence.indexOf(" ") == -1){
            last = sentence;
            break;
        }
        int spaces = sentence.indexOf(" ");
        String word = sentence.substring(0, spaces);
        sentence = sentence.substring(spaces+1);
        result = word + " "+result;
    }
            System.out.print(last+" " +result);

	}
}
