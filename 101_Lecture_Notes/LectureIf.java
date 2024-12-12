/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("You are getting ready to go the gym today");
    System.out.println("1. Eat lunch now");
    System.out.println("2. Eat lunch after");
    System.out.println("3. Eat a light snack then dinner later");
    
    int answer1 = sc.nextInt();
    
    if (answer1 == 3){
            System.out.println("You ate a light snack and will have dinner later");
            
            System.out.println("Now we have to decide, what are we hitting");
            System.out.println("1. Chest and triceps");
            System.out.println("2. Back and Biceps");
            System.out.println("3. Legs");
          
            int answer2 = sc.nextInt();
            
            if (answer2 == 1){
                System.out.println("Damn good choice have a good workout");
            }
            else if (answer2==2){
                System.out.println("eh its mid ngl but still not bad");
            }
            else if (answer2==3){
                System.out.println("Bruh there is no way but like respect cuz everyone needs bigger legs");
            } 
            
    }
    else if (answer1==1){
            System.out.println("of course you chose to eat, you big back bum");
    }
    else if (answer1==2){
            System.out.println("Damn now you have no energy and are weak, also your breathe stank bruh");
    }
    else{
        System.out.println("you didnt type a correct answer");
    }
      
    
    
	}
}