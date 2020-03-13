//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String triangle = "";
		for(int n = 0; n<word.length(); n++) {
			for(int i = 0; i<n+1;i++){
				triangle = triangle + word.substring(0,n+1);
			}
			triangle = triangle + "\n";
		}
		System.out.println(triangle);
	}
}