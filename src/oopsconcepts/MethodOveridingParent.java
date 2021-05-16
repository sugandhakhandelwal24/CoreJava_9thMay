package oopsconcepts;

import java.util.Scanner;

public class MethodOveridingParent {

	public void display(String name)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the parent class : ");
		name = scanner.next();
		
		System.out.println("Name of the parent class : " + name);
		
	}
}
