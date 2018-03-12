package unit9_elevens;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	//private List<Card> cards;
	
	//Unit 9 - Array version of the Deck
	private ArrayList<Card> cards= new ArrayList<Card>();;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	String[] Ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	String[] Suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
	int[] Values = {1,2,3,4,5,6,7,8,9,10,11,12,13};


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		Card[] temp= new Card[ranks.length*suits.length];
		
		int index = 0;
		for(int x = 0; x<suits.length;x++){
			for (int y = 0; y<ranks.length; y++){
				cards.add(new Card(ranks[y], suits[x], values[y]));
		}
		}
		size = ranks.length*suits.length;
		shuffle();	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if (size == 0){
			return true;
		}
		return false;
		}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
	
		return this.cards.size();
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/*int[] indexes = new int[cards.length];
		for (int x = 0; x<cards.length; x++){
			indexes[x] = x;
		}
		Card[] newCardDeck = cards;
		selectionShuffle(indexes);
		for (int y=0; y<cards.length; y++){
			newCardDeck[y] = cards[indexes[y]];

		}	
		*/
		
		
		int x;
		for (int y = cards.size()-1; y>0; y--){
			Random r = new Random();
			x = r.nextInt(y);
			Card cardsnew = cards.get(y);
			cards.set(y, cards.get(x));
			cards.set(x, cardsnew);
		}
	}
		public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];

		for (int k = 0; k<values.length; k++){
			Random r = new Random();
			int rand = r.nextInt(values.length-1)+1;
			int x = values[k];
			values[k] = values[rand];
			values[rand] = x;
		}
		
		
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (isEmpty()){
			return null;
			 
		}
		else
			return cards.get(--size);	
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		int x = cards.size();

		//Unit 9 - modify to work with Arrays
		
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}
		

		rtn = rtn + "\n";
		return rtn;
	}
}
