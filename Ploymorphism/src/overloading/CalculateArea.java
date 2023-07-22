package overloading;

public class CalculateArea {
	
	void area(int radius)
	{
		double pi = 3.14159;
		System.out.println("Area of Circle with Radius "+radius+" is-> "+ pi*radius*radius);
	}
	
	void area(int base,int height)
	{
		System.out.println("Area of Triangle with Base "+base+" and Height "+height+" is-> "+ (base*height)/2);
	}
	
	void area(double length,double widght)
	{
		System.out.println("Area of Rectangle with Length "+length+" and Widght "+widght+" is-> "+ length*widght);
	}
	
	public static void main(String[] args) {
		CalculateArea c1 = new CalculateArea();
		c1.area(5);
		c1.area(2, 3);
		c1.area(5.4, 5.6);
	}

}
