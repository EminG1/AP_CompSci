/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
     
        greeting("John");
        greeting("Jayden");
        greeting("Jimothy II");
        
        double num = raise(6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000 , 6);
        System.out.println(num);
        
    }
    
    public static double raise(double salary, int percent){
        double amount = salary + (salary * (percent/100.0));
        return amount;
    }
    
    public static void greeting(String name){
        System.out.println("yo " + name);   
    }

    public static void printAnimal(){
        System.out.println(" \\_/-.--.--.--.--.--.");
        System.out.println(" (\")__)__)__)__)__)__)");
        System.out.println("  ^ \"\" \"\" \"\" \"\" \"\" \"\"");
        System.out.println(" ");
        return;
        
    }

}