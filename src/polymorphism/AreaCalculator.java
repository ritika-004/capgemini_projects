package polymorphism;

public class AreaCalculator {
	public static double calculateArea(double side)
	{
		return side*side;
	}
	public static double calculateArea(double length, double breadth)
	{
		return length*breadth;
	}
	public static float calculateArea(float radius)
	{
		return (float) (3.14*radius*radius);
	}

}
