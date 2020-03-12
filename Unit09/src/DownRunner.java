import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		List<Integer> list1 = new ArrayList<>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345));
		System.out.println(ListDown.go(list1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListDown.go(list2));
		List<Integer> list3 = new ArrayList<>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListDown.go(list3));
		List<Integer> list4 = new ArrayList<>(Arrays.asList(32767));
		System.out.println(ListDown.go(list4));
		List<Integer> list5 = new ArrayList<>(Arrays.asList(255,255));
		System.out.println(ListDown.go(list5));
		List<Integer> list6 = new ArrayList<>(Arrays.asList(9,10,-88,100,-555,1000));
		System.out.println(ListDown.go(list6));
		List<Integer> list7 = new ArrayList<>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListDown.go(list7));
		List<Integer> list8 = new ArrayList<>(Arrays.asList(-111,1,2,3,9,11,20,30));
		System.out.println(ListDown.go(list8));
		List<Integer> list9 = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989));
		System.out.println(ListDown.go(list9));
		List<Integer> list10 = new ArrayList<>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListDown.go(list10));
		List<Integer> list11 = new ArrayList<>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455));
		System.out.println(ListDown.go(list11));
		List<Integer> list12 = new ArrayList<>(Arrays.asList(9,10,-8,10000,-5000,1000));
		System.out.println(ListDown.go(list12));
	}
}