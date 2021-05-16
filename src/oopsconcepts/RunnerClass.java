package oopsconcepts;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ClassA Emp1 = new ClassA();
		Emp1.Name = "John";
		Emp1.Salary = 10331;
		Emp1.OrgName = "Walmart"; */
		
		/* ClassA Emp11 = new ClassA(); // created the object of default constructor
		
		ClassA Emp1 = new ClassA(1232,"Wayne","Walmart"); //created the object of parameter constructor
		
		Emp1.Display();
		
		// --- Object Creation of Class B ---
		
		ClassB obj1 = new ClassB();
		obj1.Name = "John";
		obj1.OrgName = "Google";
		obj1.Salary = 1212;
		
		obj1.show();
		obj1.Display();
		
		ClassC obj2 = new ClassC();
		
		obj2.Name = "Tony";
		obj2.OrgName = "Sapient";
		obj2.Salary = 123123;
		
		obj2.Display();
		obj2.show();
		obj2.run(); */
		
		MethodOverloading method = new MethodOverloading();
		method.add(10,20);
		method.add(1.1, 2.3);
		
		MethodOveridingChild child = new MethodOveridingChild();
		child.display(null);
		
		AbstractChild abschild = new AbstractChild();
		abschild.method2();
		abschild.method1();
		
		InterfaceChild obj = new InterfaceChild();
		obj.display();
		obj.show();
		obj.view();
		
		EncapsulationExample enc = new EncapsulationExample();
		enc.setSalary(1000);
		System.out.println("Salary is : " + enc.getSalary());
		enc.setName("John Wick");
		System.out.println("Name is : " + enc.getName());
		enc.setEmpId(1231);
		System.out.println("Employee Id is : " + enc.getEmpId());
		
		

	}

}
