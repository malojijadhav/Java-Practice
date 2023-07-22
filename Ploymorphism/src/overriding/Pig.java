package overriding;

public class Pig extends Animal{
	
	@Override
	void printSound() {
		System.out.println("ppp");
	}
	
	
	public static void main(String[] args) {
		Animal a;
		
		a = new Pig();
		a.printSound();
	}

}
