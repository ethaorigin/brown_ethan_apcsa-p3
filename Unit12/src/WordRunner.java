//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\EthaO\\OneDrive\\Desktop\\brown_ethan_apcsa-p3\\Unit12\\src\\words.dat"));

		int size = file.nextInt();
		Word[] words = new Word[size];
		file.nextLine();
		
		for (int n = 0; n<size; n++) {
			words[n] = new Word(file.nextLine());
		}
		
		Arrays.sort(words);
		
		for (int n = 0; n<size; n++) {
			System.out.println(words[n]);
		}
		











	}
}