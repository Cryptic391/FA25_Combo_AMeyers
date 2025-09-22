package Chapter5;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		isPositive(num);
		System.out.println(isPositive(num));
		

	}

	private static String isPositive(int num) 
	{
		if (num > 0)
			return "The number is Positive.";
		else if (num == 0)
			return "The number is Zero.";		
		else
			return "The number is Negative.";
		
	}

}
