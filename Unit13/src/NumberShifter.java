//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] numbers = new int[size];
		for (int n = 0; n<numbers.length; n++) {
			numbers[n] = (int)(Math.random()*10);
		}		
		return numbers;
	}
	
	public static int[] shiftEm(int[] array)
	{
		int[] shifted = new int[array.length];
		int counter = 0;
		for (int n = 0; n< shifted.length; n++) {
			if(array[n]==7) {
				shifted[counter]=7;
				counter++;
			}
		}
		for (int n = 0; n<shifted.length; n++) {
			if(array[n]!=7) {
				shifted[counter]=array[n];
				counter++;
			}
		}
		return shifted;
	}
	
	
	
}