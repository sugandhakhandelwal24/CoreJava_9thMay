package oopsconcepts;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Interger output : " + sum);
	}

	public void add(double a, double b)
	{
		double sum = a+b;
		System.out.println("double output : " + sum);
	}

	
}
