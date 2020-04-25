//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence){
		wordRay = sentence.split(" ");
	}

	public void sort(){
		for (int n = 1; n<wordRay.length; n++){
			String temp = wordRay[n];
			int comp = n;
			while (comp>0 && wordRay[comp - 1].compareTo(temp)>0){
				wordRay[comp] = wordRay[comp - 1];
				comp--;
			}
			wordRay[comp] = temp;
		}
	}

	public String toString(){
		String output = "";
		for (String word : wordRay){
			output = output + word + "\n";
		}
		
		return output + "\n\n";
	}
}