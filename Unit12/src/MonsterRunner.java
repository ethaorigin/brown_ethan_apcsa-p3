//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		String name1 = keyboard.next();
		int size1 = keyboard.nextInt();
		
		//instantiate monster one
		Monster one = new Skeleton(name1, size1);
		
		//ask for name and size
		String name2 = keyboard.next();
		int size2 = keyboard.nextInt();
		//instantiate monster two
		Monster two = new Skeleton(name2, size2);
		
		if(one.isBigger(two) && two.isBigger(one)) {
			System.out.println("The monsters are the same size");
		} else if (one.isBigger(two)){
			System.out.println("Monster 1 is bigger than Monster 2");
		} else {
			System.out.println("Monster 2 is bigger than Monster 1");
		}
		
		if(one.namesTheSame(two)) {
			System.out.println("The monsters have the same names");
		} else {
			System.out.println("The monsters don\'t have the same names");
		}
		
	}
}