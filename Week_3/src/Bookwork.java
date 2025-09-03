import java.util.Scanner;

public class Bookwork {

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
//		System.out.println(System.out);
//	
//		System.out.println("Type something");
//		String word = input.next(); 	//next is only the next single word
//		System.out.println(word);
//		
//		input.nextLine(); 	//clears buffer so the next statement doesn't pull from last statement
//		
//		System.out.println("Type something");
//		String words = input.nextLine();	 //next line is whole next statement
//		System.out.println(words);		

		
		
//		final double CM_PER_INCH = 2.54;	//this is a constant, final means it can't be changed from this value
//		int inch = 100;
//		double cm = inch * CM_PER_INCH;
		
//		System.out.println("How many inches?");
//		inch = input.nextInt();
//		
//		cm = inch * 2.54; 	//2.54 is a literal, could be replaced by CM_PER_INCH
//		System.out.print(inch + " in = ");
//		System.out.println(cm + " cm");
//		System.out.println(CM_PER_INCH);
		
//		System.out.println(4/3);	//will only output integer 
//		System.out.println(4.0/3);	//will output full number with decimals
//		
//		System.out.printf("Four thirds = %.3f\n", 4.0/3);
//		System.out.printf("%d in = %f cm\n", inch, cm);
		
		
//		String num = "73";
//		double pi = 3.14;
//		
//		System.out.println((int)pi + " " + pi);
//		System.out.println(Integer.parseInt(num) + pi);
//		System.out.println(num + pi);
//		
		
		
//		int feet = 76/12;
//		int inches = 76%12;
//		
//		System.out.println(feet + "' " + inches + "\" ");
		
		
		
		double cm;
		int feet, inches, remainder;
		final int IN_PER_FOOT = 12;
		final double CM_PER_INCH = 2.54;
		
		System.out.println("Exactly how many centimeters?");
		cm = input.nextDouble();
		
		inches = (int)(cm/CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT; //% is devision with remainder
		
		System.out.printf("%.2f cm is %d ft and %d in\n", cm, feet, remainder);
		
		
	}

}
