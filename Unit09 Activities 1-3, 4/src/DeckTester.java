/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"two", "ten", "queen"};
		String[] suits = {"hearts", "diamonds", "clubs"};
		int[] values = {2, 10, 12};
		Deck deck1 = new Deck(ranks, suits, values);
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		deck1.selectionShuffle();
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.deal());
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
	}
}
