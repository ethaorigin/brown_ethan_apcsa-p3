//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int n = 0; n<rows; n++) {
			for (int i = 0; i<cols; i++) {
				grid[n][i] = vals[(int)(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int[] counts = new int[vals.length];
		for(int n = 0; n<vals.length; n++) {
			counts[n]=countVals(vals[n]);
		}
		int mostIndex = 0;
		for (int n = 1; n<counts.length; n++) {
			if(counts[n]>mostIndex) {
				mostIndex=n;
			}
		}
		return vals[mostIndex] + " occurs the most";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int total = 0;
		for(int n = 0; n<grid.length; n++) {
			for(int i = 0; i<grid[n].length; i++) {
				if(val.equals(grid[n][i])) {
					total++;
				}
			}
		}
		return total;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int n = 0; n<grid.length; n++) {
			for(int i = 0; i<grid[n].length; i++) {
				output = output + grid[n][i] + " ";
			}
			output = output+"\n";
		}
		
		return output;
	}
}