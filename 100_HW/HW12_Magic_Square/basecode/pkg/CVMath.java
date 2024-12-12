package pkg;

public class CVMath {		
	
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int n){
		int count = 0;
		int number = 1;
		
		while (count < n ){
			int sum = number * (number +1)/2 ;
			int sqrt = (int) Math.sqrt(sum);
			if(sqrt * sqrt == sum) {
				System.out.println(sum);
				count++;
			}
			number++;
		}
}
}