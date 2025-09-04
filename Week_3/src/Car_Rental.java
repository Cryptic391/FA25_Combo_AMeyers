import java.util.Scanner;

public class Car_Rental {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int days, miles, carCode, dayPrice;
		double total, milePrice, dayTotal;
		char anotherCustomer = 'y';
		dayTotal = 0;
		total = 0;
		
		if (anotherCustomer == 'y')
			
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
		
		System.out.println("Days?");
		days = input.nextInt();
		
		System.out.println("Miles?");
		miles = input.nextInt();
		
		total = days * dayPrice + miles * milePrice;
		System.out.printf("Your total is $%.2f", total);
		
		
		
		}

	}

}
