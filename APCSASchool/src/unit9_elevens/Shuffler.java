package unit9_elevens;

import java.util.Random;

public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3, 4};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			System.out.print("  " + j + ":");
			perfectShuffle(values1);

			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		int[] shuffled = new int[values.length];
		if (values.length%2==0){
			int k = 0;
			for (int j = 0; j<=(values.length-2)/2; j++){
				shuffled[k] = values[j];
				k+=2;
			}
	
			k = 1;
			for (int j = ((values.length-2)/2)+1; j<values.length; j++){
				shuffled[k] = values[j];
				k+=2;
			}
		}
	if (values.length%2 == 1) 
	{
		int k = 0;
			for (int j = 0; j<=(values.length-1)/2; j++){
				shuffled[k] = values[j];
				k+=2;
			}
	
			k = 1;
			for (int j = ((values.length-1)/2)+1; j<values.length; j++){
				shuffled[k] = values[j];
				k+=2;
			}
	}


		values = shuffled;
for (int x = 0; x<values.length;x++){
			System.out.print(values[x] + " ");
		}

	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
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
}