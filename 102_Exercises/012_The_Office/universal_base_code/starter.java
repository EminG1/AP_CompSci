/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66);
		Jim.employeeToString();

		Employee Pam = new Employee(2011,"Pam","Beesly",2250.0);
		Pam.employeeToString();		
		
		Employee Harvey = new Employee(1111, "Harvey", "Specter", 166666.67);
		Harvey.employeeToString();
		
		michael.raiseSalary(5);
		Dwight.raiseSalary(5);
		Jim.raiseSalary(5);
		Pam.raiseSalary(5);
		Harvey.raiseSalary(5);
		
		System.out.println("Michael makes "+michael.getSalary() +" a month");
		System.out.println("Dwight makes "+Dwight.getSalary() +" a month");
		System.out.println("Jim makes "+Jim.getSalary() +" a month");
		System.out.println("Pam makes "+Pam.getSalary() +" a month");
		System.out.println("Harvey makes "+Harvey.getSalary() +" a month");
		
		System.out.println("------------------------------");
		
		System.out.println("Michael makes "+michael.getAnnualSalary() +" a year");
		System.out.println("Dwight makes "+Dwight.getAnnualSalary() +" a year");
		System.out.println("Jim makes "+Jim.getAnnualSalary() +" a year");
		System.out.println("Pam makes "+Pam.getAnnualSalary() +" a year");
		System.out.println("Harvey makes "+Harvey.getAnnualSalary() +" a year");

	}
}
