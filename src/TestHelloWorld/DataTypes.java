package TestHelloWorld;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		
		//--Data types in Java -----
		
		int num1;
		int num2;

		
		num1 = 34;
		num2 = 5;
		
		int sum = num1 + num2;
		//System.out.println(sum);
		
		System.out.println("Addition :" + sum);
		
		int multiplication = num1 * num2;
		
		System.out.println("Multiplication :" + multiplication);
			
		float div = (float) num1/num2; //typecasting
		
		System.out.println("Division :" + div);
		
		//String name = "Sugandha";
		
		// --- To get the value from the user runtime --
		
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the user : ");
		
		String name = scanner.next();
		
		//String name = scanner.nextLine(); // used for names with space like Sugandha Khandelwal
	
		System.out.println("Hello " + name);
		System.out.println("Length of the name " + name.length());
		System.out.println("Upper case " + name.toUpperCase()); */
		
		// ---Array ---
		
		int myarray[] = {10,2,4,6,7,89};
		System.out.println("Third value of the array : " + myarray[3]);
		
		String stringarray[] = {"Test","Data","CCD", "xyz"};
		
		System.out.println("Second value of the array : " + stringarray[2]);
		
		
	}

}
