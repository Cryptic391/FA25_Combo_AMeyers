import java.util.Scanner;

public class Strings_Work {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String word = input.next();
		
		for(int i = 0; i < word.length(); i ++)
		{
			System.out.print(word.charAt(i) + " ");
		}

		String reversed = reverse(word);
		System.out.println();
		System.out.println(reversed);
		
		
		
		
		
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
