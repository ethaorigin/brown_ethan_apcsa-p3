import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		List<Integer> list1 = new ArrayList<>(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11));
		System.out.println(ListOddToEven.go(list1));
		List<Integer> list12 = new ArrayList<>(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7));
		System.out.println(ListOddToEven.go(list12));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40,5,41,31,20,11,7));
		System.out.println(ListOddToEven.go(list2));
		List<Integer> list3 = new ArrayList<>(Arrays.asList(32767,70,4,5,6,7));
		System.out.println(ListOddToEven.go(list3));
		List<Integer> list4 = new ArrayList<>(Arrays.asList(2,7,11,21,5,7));
		System.out.println(ListOddToEven.go(list4));
		List<Integer> list5 = new ArrayList<>(Arrays.asList(7,255,11,255,100,3,2));
		System.out.println(ListOddToEven.go(list5));
		List<Integer> list6 = new ArrayList<>(Arrays.asList(9,11,11,11,7,1000,3));
		System.out.println(ListOddToEven.go(list6));
		List<Integer> list8 = new ArrayList<>(Arrays.asList(7,7,7,11,2,7,7,11,11,2));
		System.out.println(ListOddToEven.go(list8));
		List<Integer> list9 = new ArrayList<>(Arrays.asList(2,4,6,8,8));
		System.out.println(ListOddToEven.go(list9));

	}
}