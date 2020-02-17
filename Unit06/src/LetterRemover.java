//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		sentence = "";
		lookFor = 'a';
	}

	public LetterRemover(String str, char letter) {
		sentence = str;
		lookFor = letter;
	}
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = "";
		for(int n = 0; n<sentence.length(); n++) {
			if (sentence.charAt(n)!=lookFor) {
				cleaned = cleaned + sentence.charAt(n);
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}