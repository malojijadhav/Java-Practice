package overriding;

public class Cat extends Animal{
	
	@Override
	void printSound() {
		System.out.println("Mew");
	}
	
	
	public static void main(String[] args) {
		Animal a;
		a = new Cat();
		a.printSound();
		
	}
	
	

}
