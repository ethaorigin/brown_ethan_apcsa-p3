//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddpos = -1;
		int evenpos = -1;
		
		for (int n = 0; n < ray.size(); n++) {
			if (ray.get(n)%2==1) {
				oddpos = n;
				break;
			}
		}
		if (oddpos==-1) {
			return -1;
		}
		for (int n = ray.size()-1; n>oddpos; n--) {
			if (ray.get(n)%2==0) {
				evenpos = n;
				break;
			}
		}
		if (evenpos==-1) {
			return -1;
		}

		return evenpos-oddpos;
		
	}
}