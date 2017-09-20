import java.util.ArrayList;

public class Blackjack {
	public static void main(String[] args) {
		String[] suits = {"hearts", "spades", "clubs", "diamonds"};
		String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"};
		
		ArrayList<String> cards = new ArrayList<String>();
		for (String s : suits) {
			for (String v : values) {
				cards.add(v + " of " + s);
				System.out.println(v + " of " + s);
			}
		}		
	}
	
	public void shuffle() {
		
	}
}
