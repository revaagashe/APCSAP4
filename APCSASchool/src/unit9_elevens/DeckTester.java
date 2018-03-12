package unit9_elevens;
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		Deck x = new Deck(ranks, suits, values);
		x.shuffle();

		/*System.out.println(x.deal());
		System.out.println(x.size());
		System.out.println(x.isEmpty());*/
		
		
	}
}