//(c) A+ Computer Science
//www.apluscompsci.com
//Name


public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word("Hello");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test.toString());
		System.out.println("\n");
		test.setString("World");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test.toString());
		System.out.println("\n");
		test.setString("JukeBox");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test.toString());
		System.out.println("\n");
		test.setString("TCEA");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test.toString());
		System.out.println("\n");
		test.setString("UIL");
		System.out.println(test.getFirstChar());
		System.out.println(test.getLastChar());
		System.out.println(test.getBackwards());
		System.out.println(test.toString());
	}
}