/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
public static void main(String args[]) {

	int [] arr = new int[100];
	int i = 0;
	while (i<arr.length){
		arr [i] = (int)(Math.random()*99)+1;
		i++;
	}
	System.out.print("here is a list of the numbers in the array: ");
	toStringArray(arr);
	System.out.println(" ");
	System.out.println("the average is " + getArrayAverage(arr));
	System.out.println("the max is " + getArrayMax(arr));
	System.out.println("the min is " + getArrayMin(arr));

	}
	
public static void toStringArray(int [] a){
	int c = 0;
	while(c<a.length){
		System.out.print(a[c]+ " ");
		c++;
	}
}

public static int getArrayAverage(int [] a){
	int c = 0;
	int total = 0;
	while(c<a.length-1){
	total += a[c];
	c++;
	}
	int avg = total/a.length;
	return avg;
}

public static int getArrayMax(int [] a){
int max = 0;

	for(int c=0;c<a.length; c++){
		if(a[c]>max){
			max = a[c];
}
}
return max;
}
public static int getArrayMin(int [] a){
int min = Integer.MAX_VALUE;
	
	for(int c=0;c<a.length; c++){
		if(a[c]<min){
			min = a[c];
		}
	}
	return min;
}
}
