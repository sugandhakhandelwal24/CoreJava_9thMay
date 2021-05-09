package oopsconcepts;

public class ClassA {

	public int Salary;
	public String Name;
	public String OrgName;
	
	public ClassA()
	{
		System.out.println("Inside constructor");
	}
	
	/* public ClassA(int val1, String val2, String val3)
	{
		System.out.println("Inside Parameter Constructor");
		Salary = val1;
		Name = val2;
		OrgName = val3;
	} */
	
	public ClassA(int val1, String val2, String val3)
	{
		System.out.println("Inside Parameter Constructor");
		this.Salary = val1;
		this.Name = val2;
		this.OrgName = val3;
	}
	
	public  void Display()
	{
		System.out.println("Name of the Employee : " + Name);
		System.out.println("Salary of the Employee : " + Salary);
		System.out.println("Name of the Organisation : " + OrgName);
		
	}
	
}
