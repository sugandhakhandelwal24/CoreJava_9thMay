package TestHelloWorld;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		boolean isPrime=true;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else noterwer
		if(isPrime)
		   System.out.println("Number is Prime : " + num);
		else
		   System.out.println("Number is not Prime : " + num);
	   

	}

}
