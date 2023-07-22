package overriding;

public class Dog extends Animal{
	
	@Override
	void printSound() {
		System.out.println("Bark");
	}
	
	public static void main(String[] args) {
		Animal a;
		a = new Dog();
		a.printSound();
		
	}

}
