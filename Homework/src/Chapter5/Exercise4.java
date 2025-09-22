package Chapter5;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7: ");
		int num = input.nextInt();
		getWeekDay(num);
		System.out.println("The day is " + getWeekDay(num));
	}

	private static String getWeekDay(int num) 
	{
					
		if(num == 1)
			return "Sunday.";
		else if(num == 2)
			return "Monday.";
		else if(num == 3)
			return "Tuesday.";
		else if(num == 4)
			return "Wednesday.";
		else if(num == 5)
			return "Thursday.";
		else if(num == 6)
			return "Friday.";
		else
			return "Saturday.";
				
	}

}
