//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		if(ray.length==0) {
			return 1;
		}
		for (int n = 0; n<ray.length; n++) {
			if(ray[n]>ray[ray.length-1]) {
				sum = sum + ray[n];
			}
		}
		if(sum==0) {
			return -1;
		}
		return sum;
		
	}
}