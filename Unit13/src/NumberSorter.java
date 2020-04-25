//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number){
		int counter = 0;
		
		while(number>0){
			counter++;
			number = number/10;
		}
		
		return counter;
	}

	public static int[] getSortedDigitArray(int number){
		int[] sortedNums = new int[getNumDigits(number)];
		int index = 0;
		while(number>0){
				sortedNums[index] = number%10;
				number = number/10;
				index++;
		}
		
		for(int n = 0; n<sortedNums.length; n++){
			int min = n;
			for(int k = n + 1; k<sortedNums.length; k++ ){
				if(sortedNums[k]<sortedNums[min]){
					min = k;
				}
			}
			
			int temp = sortedNums[min];
			sortedNums[min] = sortedNums[n];
			sortedNums[n] = temp;
		}
		
		return sortedNums;
		
	}
}