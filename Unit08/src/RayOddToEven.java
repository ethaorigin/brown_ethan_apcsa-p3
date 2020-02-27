//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		for (int n = 0; n<ray.length; n++) {
			if(ray[n]%2==1) {
				for (int k = n+1; k<ray.length; k++) {
					if(ray[k]%2==0) {
						return k-n;
					}
				}
			}
		}
		return -1;

	}
}