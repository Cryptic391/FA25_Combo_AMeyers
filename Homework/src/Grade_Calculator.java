import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade: ");
		double grade = input.nextDouble();
		if (grade >= 92)
			System.out.println("Your grade is an A.");
		else if (grade >= 89 && grade < 92)
			System.out.println("Your grade is an A-.");
		else if (grade >= 87 && grade < 89)
			System.out.println("Your grade is a B+.");
		else if (grade >= 82 && grade < 87)
			System.out.println("Your grade is a B.");
		else if (grade >= 79 && grade < 82)
			System.out.println("Your grade is a B-.");
		else if (grade >= 77 && grade < 79)
			System.out.println("Your grade is a C+.");
		else if (grade >= 72 && grade < 77)
			System.out.println("Your grade is a C.");
		else if (grade >= 69 && grade < 72)
			System.out.println("Your grade is a C-.");
		else if (grade >= 67 && grade < 69)
			System.out.println("Your grade is a D+.");
		else if (grade >= 60 && grade < 67)
			System.out.println("Your grade is a D.");
		else if (grade >= 0 && grade < 60)
			System.out.println("Your grade is an F.");
		else 
			System.out.println("You've entered an invalid grade.");
		

	}

}
