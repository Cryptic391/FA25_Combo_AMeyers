import java.util.Scanner;

public class Input_Play {
	
	public static Scanner input = new Scanner(System.in); 	//any method can use the scanner
	
	public static void main(String[] args) {
		
		nameAge();		//Runs the nameAge method with no parameters or returns
		
		tempConvert(); 
				
		System.out.println("Enter kilos:");
		
		double kilos = input.nextDouble();
		
		double pounds = convertToPounds(kilos);
		
		System.out.printf("%.2f pounds." , pounds);
		
	}
	
	private static void tempConvert()
	{
		System.out.println("What is the temperature in Fahrenheit");
		
		double fTemp = input.nextDouble(); //sets fTemp to the next number entered
		
		double cTemp = convertToC(fTemp); //calls the convertToC method using fTemp
		
		double kTemp = convertToK(cTemp); //calls the convertToK method using cTemp
		
		System.out.println(fTemp + "°F is " + cTemp + "°C and " + kTemp + "°K" ); //Prints out the long version of the Temperatures
				
		System.out.printf("%.2f°F is %.2f°C and %.2f°K%n",fTemp,cTemp,kTemp); //printf changes how it prints based on arguments, %.2 is the number of places after decimal, in this case 2
		
	}

	//private means it can only be accessed by the class it's contained in
	private static double convertToPounds(double kilos) 
	{
		return kilos * 2.2;
	}

	
	//void is the return type for returning nothing
	//printInput is the name and there are no parameter
	public static void nameAge() 
	{
		System.out.println("What is your name?");
		
		String name = input.next();
		
		System.out.println("Nice to meet you " + name + ".");
		
		System.out.println("Enter your age in years?");
		
		int age = input.nextInt();
		
		System.out.println("You are " + age + " years old.");
	
	}
	
	//public lets everyone use this
	//double is the data type of what is returned
	//double fTemp is the variable used inside this method, it is a parameter/argument
	public static double convertToC(double fTemp)
	{
		return (fTemp -32) *5/9;
	}	
	
	public static double convertToK(double cTemp)
	{
		return cTemp + 273.15;
	}	
	
}
	
