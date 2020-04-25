//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	
	public static void main( String args[] ) throws IOException{
		Scanner text = new Scanner(new File("src//wordsorttwo.dat"));
		int size = text.nextInt();
		text.nextLine();
		
		for(int n = 0; n<size; n++){
			String str = text.nextLine();
			WordSortTwo test = new WordSortTwo(str);
			test.sort();
			System.out.print(test);
		}
		
	}
}