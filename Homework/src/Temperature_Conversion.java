import java.util.Scanner;

public class Temperature_Conversion {

	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature in Fahrenheit.");
		double fTemp = input.nextDouble();
		double cTemp = ((fTemp - 32)*5)/9;
		double kTemp = cTemp + 273.15;
		System.out.printf("The temperature in Celsius is %.2f°.", cTemp);
		System.out.println();
		System.out.printf("The temperature in Kelvin is %.2f°.", kTemp);

	}

}
