import java.util.Scanner;

public class Coding_Flows {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String another = "y";
		int dailyTotal = 0;
		
		
		while (another.equals("y"))
		{
			int total = 0;
			System.out.println("How many credits are you taking?");
			int credits = input.nextInt();
			if (credits > 5) 
			{	
				total =+ 250;
			}
			
			else
			{
				System.out.println("Would you like to participate in activites?");
				String fee = input.next();
				if(fee.equals("y"))
				{
					total += 250;
				}
					
			}	
			
			 total += credits * 560 + 650;
			 dailyTotal += total;
			
			System.out.println("Your total is $" + total + ".00");
			
			System.out.println("Is there another student?");
			
			another = input.next();
			
		}
		System.out.println("The daily total is " + dailyTotal + ".00");
	}
}