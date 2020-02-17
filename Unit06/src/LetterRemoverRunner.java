//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n");
		test.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n");
		test.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n");
		test.setRemover("abababababa", 'b');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n");
		test.setRemover("abaababababa", 'x');
		System.out.println(test.toString());
		System.out.println(test.removeLetters());
		System.out.println("\n");
											
	}
}