//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int denom;
	//write two constructors
	
	public Rational() {
		setRational(0, 0);
	}
	
	public Rational(int numerator, int denominator) {
		setRational(numerator, denominator);
	}


	//write a setRational method
	public void setRational(int numerator, int denominator) {
		num = numerator;
		denom = denominator;
	}


	public int getNumerator() {
		return num;
	}
	public int getDenominator() {
		return denom;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num = num*other.getDenominator() + denom*other.getNumerator();
		denom = denom*other.getDenominator();
		
		


		reduce();
	}

	private void reduce()
	{
		int max;
		if(num > denom) {
			max = num;
		} else {
			max = denom;
		}
		
		for(int n = max;n>0; n--) {
			if(num%n==0&&denom%n==0) {
				num = num/n;
				denom = denom/n;
			}
		}


	}


	public Object clone ()
	{
		Rational c = new Rational(num, denom);
		return c;
	}

	
	public boolean equals(Rational r)
	{
		reduce();
		r.reduce();
		if(num==r.getNumerator() && denom==r.getDenominator()) {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		double one = (double) ((double)num / (double)denom);
		double two = (double) ((double)other.getNumerator() / (double)other.getDenominator());
		if(one>two) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
	

	public String toString() {
		return(num + "/" + denom);
	}
	
	
	
}