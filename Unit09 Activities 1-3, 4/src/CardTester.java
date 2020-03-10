/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card test1 = new Card("nine", "spades", 9);
		Card test2 = new Card("two", "hearts", 2);
		Card test3 = new Card("king", "diamonds", 13);
		System.out.println(test1.matches(test2));
		System.out.println(test3.toString());
	}
}
