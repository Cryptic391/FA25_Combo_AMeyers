package Chapter7;

import java.util.Scanner;

public class Ex_7_8 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String 1: ");
		String str1 = input.nextLine();
		System.out.println("Enter String 2: ");
		String str2 = input.nextLine();
		if(isAnagram(str1,str2))
		{
			System.out.printf("%s is an anagram of %s.", str2,str1);
		}
		else
		{
			System.out.printf("%s is not an anagram of %s.", str2,str1);
		}
		
		
		

	}
	private static boolean isAnagram(String str1, String str2) 
	{
		if(str1.length() == str2.length())
		{
			for (int i = 0; i < str1.length(); i++) 
			{
				int index = str2.indexOf(str1.charAt(i));
				if(index < 0) 
				{
					return false;
				}
				else
				{
					str2 = str2.substring(0,index) + str2.substring(index+1);
				}
			}
			
		}
		else {
			return false;
		}
		return true;
	}

}
