import java.util.Scanner;

public class Exam1 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args)
	{
		MessagePrinter();
		
		BeverageSelector();		
		
		Divider();
				
		Accumulator();		
	}
	
	private static void MessagePrinter() 
	{
		System.out.println("This is my first programming test.");		
	}
	
	private static void BeverageSelector() 
	{
		System.out.println("Enter your beverage selection.");
		System.out.print("1, 2, or 3: ");
		int drink = input.nextInt();
		switch(drink)
		{
		case 1:
			System.out.println("You've chosen Water.");
			break;
		case 2:
			System.out.println("You've chosen Coke.");
			break;
		case 3:
			System.out.println("You've chosen Coffee.");
			break;
		}		
	}
		
	private static void Divider() 
	{
		System.out.print("Enter a number: ");
		double num1 = input.nextDouble();
		System.out.print("Enter a number to divide the first number by: ");
		double num2 = input.nextDouble();
		if(num2 == 0)
		{
			System.out.println("You can not divide by zero, please try again");
			Divider();
		}
		else
		{
			double answer = num1 / num2;
			System.out.printf("The answer is %.2f when you divide %.2f by %.2f", answer, num1, num2);
			System.out.println();
		}		
	}
	
	private static void Accumulator() 
	{
		double sum = 0;
		System.out.println("I will add your numbers togther.");
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		while(num!=0)
		{
			sum = sum + num;
			System.out.print("Enter the next number: ");			
			num = input.nextDouble();
		}
		System.out.printf("The sum of the numbers is: %.2f", sum);		
	}		
}