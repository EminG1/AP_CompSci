package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	String name;
	int age;
	String breed;
	
public Dog(){
	name = "clifford";
	age = 3;
	breed = "the big red dog";
}
		
public Dog(String n){
	name = n;
	age = 1;
	breed = "dog dog";
}
public Dog(String n, String b){
	name = n;
	age = 1;
	breed = b;
}
public Dog(String n, int a){
	name = n;
	age = a;
	breed = "dog dog";
}

public void setName(String n){
	name = n;
}
public void setAge(int a){
	age = a;
}
public void setBreed(String b){
	breed = b;
}
public String getName(){
	return name;
}
public int getAge(){
	return age;
}
public String getBreed(){
	return breed;
}

public boolean isSleeping(){
	int s = (int)(Math.random()*100)+1;
	if(s>50)
		return true;
	else 
		return false;
}
public void bark(){
	System.out.println(name + " bark");
}
	}


