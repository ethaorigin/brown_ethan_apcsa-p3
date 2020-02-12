//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private String evenorodd;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length()%2==0){
			evenorodd = "even.";
			return true;	
		}else {
			evenorodd = "odd.";
			return false;
		}
	}

 	public String toString()
 	{
 		String output = word + " is " + evenorodd;
 		return output;
	}
}