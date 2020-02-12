//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   
		Scanner keyboard = new Scanner(System.in);
		
		while (1==1){
			
			out.print("Enter a word :: ");
			String wordOne = keyboard.next();
			out.print("Enter another word :: ");
			String wordTwo = keyboard.next();
		
			WordsCompare test = new WordsCompare(wordOne, wordTwo);
			test.compare();
			System.out.println(test.toString());
			
		}
	}
}