//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect(496);	
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(45);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(6);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(14);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(8128);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(1245);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(33);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(28);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(27);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		test.setNumber(33550336);
		if (test.isPerfect()) {
			System.out.println(test.trueToString());
		}else{
			System.out.println(test.falseToString());
		}
		
	}
}