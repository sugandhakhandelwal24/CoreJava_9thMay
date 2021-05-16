package TestHelloWorld;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsExample exc = new ThrowsExample();
		try {
		exc.eligibility(15);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
	}

	
	public void eligibility(int age) throws ArithmeticException
	{
		if (age<18)
		{
			throw new ArithmeticException("Not eligible for voting your age is less than 18");
		}
		
		else
		{
			System.out.println("Eligible for voting");
		}}
	
}
