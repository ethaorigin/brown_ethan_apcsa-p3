//(c) A+ Computer Science
//www.apluscompsci.com
//Name -


public class Perfect
{
   private int number;

	public Perfect()
	{
		number = 0;
	}
	
	public Perfect(int n)
	{
		number = n;
	}
	
	public void setNumber(int n) {
		number = n;
	}

	public boolean isPerfect()
	{
		int counter = 0;
		for (int n = 1; n<number; n++) {
			if (number%n==0) {
				counter = counter + n;
			}
		}
		if (counter == number) {
			return true;
		}else {
			return false;
		}
	}

	public String trueToString() {
		return number + " is perfect";
	}
	
	public String falseToString() {
		return number + " is not perfect";
	}
	
}