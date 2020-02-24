//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive test = new TriangleFive('C', 4);
	   
	   System.out.println(test.toString());
	   
	   test.setAmount(5);
	   test.setLetter('A');
	   System.out.println(test.toString());
	   
	   test.setAmount(7);
	   test.setLetter('B');
	   System.out.println(test.toString());
	   
	   test.setAmount(6);
	   test.setLetter('X');
	   System.out.println(test.toString());
	   
	   test.setAmount(8);
	   test.setLetter('Z');
	   System.out.println(test.toString());
	   
	}
}