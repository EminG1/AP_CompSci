/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
			public static void toStringArray(int [] a){
	int c = 0;
	while(c<a.length){
		System.out.println(a[c]);
		c++;
	}
}

public static int getArrayAverage(int [] a){
	int c = 0;
	while(c<a.length-1){
	int avg = a[c]+a[c+1];
	return avg;
	}
}
		
}



