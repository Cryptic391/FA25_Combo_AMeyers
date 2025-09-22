import java.util.Scanner;

public class Circle_Calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the radius of the circle: ");
		double radius = input.nextDouble();
		Diameter(radius);
		Area(radius);
		Circumference(radius);
		System.out.printf("The Diameter of the circle is %.2f.", Diameter(radius));
		System.out.printf("\nThe Area of the circle is %.2f.",Area(radius));
		System.out.printf("\nThe Circumference of the circle is %.2f.", Circumference(radius));
		

	}

	private static double Circumference(double radius) 
	{
		double circum = 2 * Math.PI * radius;
		return circum;
		
	}

	private static double Area(double radius)
	{
		double area = Math.PI * (radius * radius);
		return area;
		
		
	}

	private static double Diameter(double radius) 
	{
		double diameter = 2 * radius;
		return diameter;
		
		
	}

}
