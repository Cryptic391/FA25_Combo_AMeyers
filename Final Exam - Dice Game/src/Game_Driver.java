import java.util.Scanner;

public class Game_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many dice will there be in a turn?");
		int numDice = input.nextInt();
		
		System.out.println("How many sides on the dice?");
		int numSides = input.nextInt();
		
		System.out.println("How many players?");
		int numPlayers = input.nextInt();
		
		Player[] players = new Player[numPlayers];
		
		for(int i = 0; i < numPlayers; i++) {
			System.out.println("Enter the name for player " + (i+1) + ".") ;
			String name = input.next();
			players[i] = new Player(name,0);
		}

		for (int i = 0; i < players.length; i++) {
			int roll = Die.multiRoll(numDice, numSides);
			players[i].setTotalDice(roll);
			System.out.println(players[i] + " with " + numDice + " dice, on a " + numSides + " sided die.");
		}
		
		Player winner = decideWinner(players);
		System.out.println(winner.getName() + " won the game.");
		
	}

	private static Player decideWinner(Player[] players) {
		Player winner = players[0];
		for (int i = 0; i < players.length; i++) {
			if(players[i].getTotalDice() > winner.getTotalDice())
				winner = players[i];
		}
		
		return winner;
		
		
	}

}
