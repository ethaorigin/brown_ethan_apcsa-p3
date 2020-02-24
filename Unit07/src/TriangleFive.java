//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;		
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char tempLetter = letter;
		
		for(int n = 0; n<amount; n++) { //rows
			
			for (int i = 0; i<amount-n; i++) { //columns
				
				for(int k = amount-i; k>0 ; k--) {
					output = output + tempLetter;
				}
				output = output + " ";
			
				if (tempLetter=='Z') {
					tempLetter = 'A';
				}else {
					tempLetter += 1;	
				}
				
			}
			output = output + "\n";
			tempLetter = letter;
			
		}
		
		return output;
	}
}