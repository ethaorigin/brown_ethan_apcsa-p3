//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry= new Toy("sorry");
		sorry.setCount(1);
		System.out.println(sorry);
		Toy gijoe=new Toy("gijoe");
		gijoe.setCount(5);
		System.out.println(gijoe);
	}
}