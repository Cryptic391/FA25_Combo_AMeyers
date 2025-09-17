import java.util.Scanner;

public class BookScrabble 
{

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
			for(int i = 0; i < word.length(); i++)
			{
				int index = tiles.indexOf(word.charAt(i));
				if(index < 0)
				{
					return false;
				}				
				else
				{
					tiles = tiles.substring(0 ,index) + tiles.substring(index + 1);
				}									
			}
			return true;
		}
}


