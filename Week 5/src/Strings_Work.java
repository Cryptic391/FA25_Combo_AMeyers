import java.util.Scanner;

public class Strings_Work {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
//		System.out.println("Type a word");
		String word = "bananas";
		
		for(int i = 0; i < word.length(); i ++)
		{
			System.out.print(word.charAt(i) + " ");		// b a n a n a s
		}

		
		
		
		System.out.println();
		System.out.println("" + word.charAt(2) + " is the " + (word.indexOf("n")+1) + " letter.");		//n is the 3 letter.
		String reversed = reverse(word);
		System.out.println();
		System.out.println(reversed);		//sananab
		
		
		
		
		System.out.println(word.substring(0,3));	//ban
		System.out.println(word.substring(3,6));	//ana
		System.out.println(word);	//bananas
		System.out.println(word.substring(0,3) + "d" + word.substring(3));		//bandanas
		
		
		
		System.out.println("Shall we go?");
		String answer = input.nextLine();
		answer = answer.toLowerCase();		//makes the answer string lower case
		
		
		if (answer.equals("yes"))	//one way to compare strings, doing answer == yes does not work
		{
			System.out.println("Let's go");
		}
		else
		{
			System.out.println("Wha, wha, whaaaaa........");
		}
		
		
		
		
		String name1 = "Alan Turing";
		String name2 = "Ada Lovelace";
		
		
		int diff = name1.compareTo(name2);		//compares the names alphabetically
		
		if(diff<0)
		{
			System.out.println(name1 + " comes before " + name2 + ".");
		}
		else if(diff>0)
		{
			System.out.println(name2 + " comes before " + name1 + ".");
		}
		else
		{
			System.out.println(name1 + " and " + name2 + " are the same.");
		}
		
		
		
		
		System.out.println("Enter the hour.");
		int hour = input.nextInt();
		System.out.println("Enter the minute.");
		int min = input.nextInt();
		String time = timeString(hour, min);		
		System.out.println(time);
	}

	
	
	
	private static String timeString(int hour, int min) 
	{
		String ampm;
		if(hour<12)
		{
			ampm = "AM";
			if(hour == 0)
			{
				hour = 12;
			}
		}
		else
		{
			ampm = "PM";
			hour = hour - 12;
		}
		
		
		
		
		return String.format("%02d:%02d %s", hour, min, ampm);		//%02d - digit should take up 2 spaces, if not add a 0 in front.		also add a : between hour and min and print ampm afterwards
	}

	
	
	
	private static String reverse(String word) 
	{
		String r = "";
		for(int i = word.length() -1; i >= 0; i--)
		{
			r += word.charAt(i);			
		}
		return r;
	}

}
