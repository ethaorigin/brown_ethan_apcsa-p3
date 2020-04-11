//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	String name;
	int size;

	//add a constructor
	public Skeleton(){
		name = "";
		size = 0;
	}
	
	public Skeleton(String n, int s) {
		name = n;
		size = s;
	}

	//add code to implement the Monster interface
	
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isBigger(Monster other) {
		return (size>other.getHowBig());
	}
	
	public boolean isSmaller(Monster other) {
		return (size<other.getHowBig());
	}
	
	public boolean namesTheSame(Monster other) {
		return name.contentEquals(other.getName());
	}
	
	//add a toString
	
	public String toString() {
		return(name + " has a size of " + size);
		
	}
	
}