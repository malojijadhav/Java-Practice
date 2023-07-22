package overriding;

public class Manager extends Employee{
	
	@Override
	void IncrementSalary() {
		System.out.println("In IncrementSalary Method");
	}

}
