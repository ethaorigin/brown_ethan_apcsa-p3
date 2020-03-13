//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		Dog a = new Dog(age, name);
		pups[spot] = a;
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		int oldest = -1;
		for (int n = 0; n<pups.length; n++) {
			if (pups[n].getAge()>oldest) {
				oldest = n;
			}
		}
		return pups[oldest].getName();
	}

	public String getNameOfYoungest()
	{
		int youngest = 0;
		for (int n = 0; n<pups.length; n++) {
			if (youngest==0||pups[n].getAge()<youngest) {
				youngest = n;
			}
		}
		return pups[youngest].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}