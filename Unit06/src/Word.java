//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackwards()
	{
		String back="";
		for(int n = word.length()-1; n>=0; n--) {
			back = back + word.charAt(n);
			
		}
		return back;
	}

 	public String toString()
 	{
 		return word;
	}
}