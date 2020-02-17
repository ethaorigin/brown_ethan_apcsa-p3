//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for(int n = 0; n<str.length()-1; n++) {
			if(str.charAt(n)==str.charAt(n + 1)) {
				count ++;
			}
		}
		return count;
	}
}