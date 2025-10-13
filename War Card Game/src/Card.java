
public class Card {
	private int rank;
	private int suit;
	private static final String[] ranks = {null, "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; 
	private static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	
	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}


	public boolean equals(Card that) {
		return this.rank == that.rank && this.suit == that.suit;
	}
	
	
	public int compareTo(Card that) {
		if(this.suit < that.suit) {
			return -1;
		}
		if(this.suit > that.suit) {
			return 1;
		}
		if(this.rank < that.rank) {
			return -1;
		}
		if(this.rank > that.rank) {
			return 1;
		}
		return 0;		
	}

	
	public int getRank() {
		return rank;
	}


	public int getSuit() {
		return suit;
	}

	
	@Override
	public String toString() {
		return ranks[this.rank] + " of " + suits[this.suit];
	}
	
	
	
	
	
}
