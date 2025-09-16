import java.util.Scanner;

public class Scrabble {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 7 letters.");
		String tiles = input.next();
		System.out.println("Enter a word.");
		String word = input.next();
		
		
		if(canSpell(word, tiles))
		{
			System.out.println("You can spell the word with the letters.");
		}
		else
		{
			System.out.println("You cannot spell the word with the letters.");
		}

	}
	private static boolean canSpell(String word, String tiles) 
	{
		int len = word.length();
		int count = 0;
				
		if(word.length() > tiles.length())
		{
			return false;
		}
		else
		{
		
			for (int i = 0; i < len; i++) 
			{			
				char letter = word.charAt(i);
			
				for(int j = 0; j < len; j++)
				{
					char tile = tiles.charAt(j);
					
					if(tiles.charAt(j) == word.charAt(i))
					{
						
						count++;
						System.out.println(count);
					}
					
					
				}
			}
		if(count == word.length())
		{
			
			return true;
		}
		else
		{
			
			return false;
		}
		}
		
	}

}
