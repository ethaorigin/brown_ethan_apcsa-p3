//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		float top = (y2-y1);
		float bottom = (x2-x1);
		float slope = top/bottom;
		
		return slope;
	}

}