//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> total = new ArrayList<Integer>();
		
    	int sum = 0;
    	for (int n = 0; n<m.length; n++) {
    		for(int i = 0; i<m[n].length; i++) {
    			sum += m[n][i];
    		}
    		total.add(sum);
    		sum = 0;
    	}
  
    	return total;
    }
}
