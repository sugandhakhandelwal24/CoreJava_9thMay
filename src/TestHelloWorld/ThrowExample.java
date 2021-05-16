package TestHelloWorld;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		try {
		if (age<18)
		{
			throw new ArithmeticException("Not eligible for voting your age is less than 18");
		}
		
		else
		{
			System.out.println("Eligible for voting");
		}}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handled");
		}
	}

}
