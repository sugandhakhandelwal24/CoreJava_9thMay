package oopsconcepts;

import java.util.Scanner;

public class MethodOveridingChild extends MethodOveridingParent{
	
	public void display(String name)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base class : ");
		name = scanner.next();
		System.out.println("Name of the child class : " + name);
		
	}
	
	
}
