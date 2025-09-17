import java.util.Scanner;

public class Scrabble2 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter 7 letters.");
		String tiles = input.next();		//set tiles to 7 letters
		System.out.println("Enter a word.");
		String word = input.next();		//set word to the inputed word
		
		
		if(canSpell(word, tiles))		//calls canSpell method and sends word and tiles
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
		int count, count2;
		count = 0;
		count2 = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i);
				for(int j = 0; j < word.length(); j++)
				{
					if(word.charAt(j)==letter)
					{
						count++;
					}
				}
				for(int k = 0; k < tiles.length(); k++)
				{
					if(tiles.charAt(k) == letter);
					{
					count2++;
					}					
				}
				if(count > count2)
				{
					return false;
				}
		}
		return true;		
	}
}
