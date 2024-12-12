/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
	int size = (int)(Math.random()*149)+51;
	int [] arr = new int[size];
	
	for(int c = 0; c<arr.length; c++){
		arr[c] = (int)(Math.random()*100)+1;	
	}

	int min = Integer.MAX_VALUE;
	
	for(int c=0;c<arr.length; c++){
		if(arr[c]<min){
			min = arr[c];
		}
	}

	int max = 0;

	for(int c=0;c<arr.length; c++){
		if(arr[c]>max){
			max = arr[c];
		}
	}

	int sum = 0;

	for(int c = 0; c < arr.length; c++){
		sum +=arr[c];
	}
		sum /= arr.length;
		
	System.out.println("There are "+ arr.length + " elements");
	System.out.println("The smallest number is: "+ min);
	System.out.println("The largest number is: "+ max);
	System.out.println("The average of these numbers are: "+ sum);
	}
}
