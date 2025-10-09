import java.util.Scanner;

public class Car_Rental {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int days, miles, carCode, dayPrice;
		double total, milePrice, dayTotal;
		String another = "y";
		dayTotal = 0;
		total = 0;
		
		while (another.equals("y"))
			
		{
			
			System.out.println("Car Code?");
			carCode = input.nextInt();
		
			if(carCode == 1)
			{
				dayPrice = 75;
				milePrice = 1.5;
			}	
			
			else if (carCode == 2)
			{
				dayPrice = 45;
				milePrice = .85;
				
			}
			
			else
			{
				dayPrice = 35;
				milePrice = .45;
			}
			
			System.out.println("How many Days?");
			days = input.nextInt();
			
			System.out.println("How mant miles?");
			miles = input.nextInt();
			
			total = days * dayPrice + miles * milePrice;
			System.out.printf("Your total is $%.2f.\n", total);
			
			System.out.println("Is there another customer?\n" + "y or n?");
			another = input.next();
			
			dayTotal = dayTotal + total;
		
		}
			
			
		System.out.printf("Your total for the day is $%.2f", dayTotal);
			

	}

}
