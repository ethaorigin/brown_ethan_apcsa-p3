//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		return wordOne.contentEquals(wordTwo);
	}

	public String toString(boolean doesitequal)
	{
		if (doesitequal) {
			return wordOne + " does have the same letters as " + wordTwo + "\n";
		}else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}