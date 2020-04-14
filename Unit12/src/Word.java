//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	
	public String get()
	{
		return word;
	}

	public int compareTo( Word rhs )
	{		
		if(word.length()>rhs.get().length()) {
			return 1;
		}
		
		if(word.length()<rhs.get().length()) {
			return -1;
		}
		
		for(int n = 0; n<word.length(); n++) {
			if(word.charAt(n) > rhs.get().charAt(n)) {
				return 1;
			}
			if(word.charAt(n) < rhs.get().charAt(n))
				return -1;
		}
		
		return 0;
	}

	public String toString()
	{
		return word;
	}
}