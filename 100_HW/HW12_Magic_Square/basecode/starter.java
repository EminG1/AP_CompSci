import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//CVMath.specialSquare(5);
		//System.out.println(CVMath.findMid(2,3,1));
	
	System.out.print("Please enter how many magic squares you want to see: ");
	int n = sc.nextInt();
	
	CVMath.specialSquare(n);
	}
}
