package Chapter5;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double num = input.nextDouble();
		String size = "";
		if (Math.abs(num) < 1)
			 size = " small ";		
		if(Math.abs(num) > 1000000)
			size = " large ";		
		
		if(num == 0)		
			System.out.println("The number you entered is 0.");		
		else if (num > 0)
			System.out.println("The number you entered is a" + size + "positive.");
		else
			System.out.println("The number you entered is a" + size + "negative.");
		
	}

}
