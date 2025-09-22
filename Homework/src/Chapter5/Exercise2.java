package Chapter5;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter a second number: ");
		int num2 = input.nextInt();
		System.out.print("Enter a third number: ");
		int num3 = input.nextInt();
		greatestNumber(num1,num2,num3);
		System.out.println("The greatest number is: " + greatestNumber(num1, num2, num3));
		

	}

	private static int greatestNumber(int num1, int num2, int num3) 
	{
				
		if (num1 > num2)
		{
			if (num1 > num3)
				return num1;
			else if (num2 > num3)
				return num3;
			else return num2;
		}
		else if (num2>num3)
			return num2;
		else
			return num3;
		
	}

}
