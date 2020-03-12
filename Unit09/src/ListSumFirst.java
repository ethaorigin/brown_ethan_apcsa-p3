//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for (int n = 0; n<ray.size(); n++) {
			if(ray.get(n)>ray.get(0))
				sum+=ray.get(n);
		}
		if (sum!=0) {
			return sum;
		}
		return -1;
	}
}