//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		number = num;
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int n = 1; n<a/2; n++) {
			if (a%n==0 && b%n==0 && c%n==0) {
				max = n;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		
		for (int one = 1; one<number; one++) {
			for (int two = one; two<number; two++) {
				for (int three = two; three<number; three++) {
					
					if (Math.pow(one, 2) + Math.pow(two, 2) == Math.pow(three, 2)) {
						if ((three%2==1)&&((one%2==0 && two%2==1) || (one%2==1 && two%2==0))) {
							if (greatestCommonFactor(one, two, three)<=1) {
								output = output + one + " " + two + " " + three + "\n";
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
	
}