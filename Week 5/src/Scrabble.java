import java.util.Scanner;

public class Scrabble {

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
		int len = word.length();		//sets a integer to the length of word
		int count = 0;		//sets count to 0
				
		if(word.length() > tiles.length())		//if the length of the word is greater than the number of tiles
		{
			return false;		//send false to if(canSpell)
		}
		else
		{
			char[] tileRay = tiles.toCharArray();		//creates an array with the characters in tiles
			for (int i = 0; i < len; i++)		//loops a number of times equal to the length of word
			{			
//				char letter = word.charAt(i);		//sets the letter to the letter at position i	(not needed)	
			
				for(int j = 0; j < tiles.length(); j++)		//loops a number of times equal to the length of the tiles
				{
					
//					char tile = tiles.charAt(j);		//sets the tile to the letter at position j		(not needed)
					
					
					if(word.charAt(i) == tileRay[j])		//if the character of tile j matches the character at word i
					{
						tileRay[j] = '*';		//sets character in tileRay at position j to *
						count++;		//add 1 to count
//						System.out.println(count);			//print count (trouble shoot)
						
					}
					
					
				}
			}
		if(count == word.length()-1)		//if the count equals the word length
		{
			
			return true;	//send true
		}
		else
		{
			
			return false;		//otherwise send false
		}
		}
		
	}

}
