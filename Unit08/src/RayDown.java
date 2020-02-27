//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for (int n = 0; n<numArray.length; n++) {
			if (numArray.length-1!=n&&numArray[n]<numArray[n+1]) {
				return false;
			}
		}
		return true;
	}	
}