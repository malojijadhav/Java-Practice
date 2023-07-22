package overriding;

public class Developer extends Employee{
	
	@Override
	void IncrementSalary() {
		System.out.println("In IncrementSalary Method");
	}

}
