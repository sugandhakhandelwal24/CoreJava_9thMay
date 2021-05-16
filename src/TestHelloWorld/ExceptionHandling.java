package TestHelloWorld;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int a = 10;
		int b =0;
		int result= a/b;
		System.out.println(result);// it will throw exception handling and to resolve this we use try catch */
		
		int a = 10;
		int b = 0; 
		//int b = 5;
		try {
			
			int result = a/b;
			
			System.out.println("after error"); // after error it will not executed & if you want to print that line put it in the catch block or after the catch block
		
		}catch (ArithmeticException e)  //multiple catch blocks
		{
		
			System.out.println("Arithmetic Exception Handled");
		//	System.out.println("Arithmetic exception : After error");
		}
		
		catch (Exception e)
		{
			
			System.out.println("Exception Handled");
			
		} finally
		{
			System.out.println("Try Catch Executed successfully");
		}
		
		System.out.println("after error");
		System.out.println("Hello");
		
		int myarray[] = {10,2,4,6,7,89};
		// System.out.println("Third value of the array : " + myarray[7]); // throw error ArrayIndexOutOfBoundsException exception
		
		try {
			
			System.out.println("Seventh value of the array : " + myarray[7]); 
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception handled");
		}
		
	}

}
