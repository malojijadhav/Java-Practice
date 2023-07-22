package overloading;

public class Addition {
	
	void add(int a)
	{
		System.out.println("Value of a -> "+ a);
	}
	void add(int a,int b)
	{
		System.out.println("Value of a -> "+ a +" Value of b -> "+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println("Value of a -> "+ a +" Value of b -> "+b +" Value of c -> "+c);
	}
	
	public static void main(String[] args) {
		Addition a1 = new Addition();
		a1.add(1);
		a1.add(1, 2);
		a1.add(1, 2, 3);
	}

}
