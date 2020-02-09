//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{

		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		System.out.println("76 is odd :: " + NumberVerify.isOdd(76));
		System.out.println("76 is even :: " + NumberVerify.isEven(76));
		System.out.println("859845 is odd :: " + NumberVerify.isOdd(859845));
		System.out.println("859845 is even :: " + NumberVerify.isEven(859845));
		System.out.println("9999 is odd :: " + NumberVerify.isOdd(9999));
		System.out.println("9999 is even :: " + NumberVerify.isEven(9999));
		
	}
}