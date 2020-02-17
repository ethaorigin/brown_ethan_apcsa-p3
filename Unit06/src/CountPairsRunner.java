//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		System.out.println( "\"" + "ddogccatppig" +  "\" contains " + CountPairs.pairCounter("ddogccatppig") + " letter pairs.");
		System.out.println( "\"" + "dogcatpig" +  "\" contains " + CountPairs.pairCounter("dogcatpig") + " letter pairs.");
		System.out.println( "\"" + "xxyyzz" +  "\" contains " + CountPairs.pairCounter("xxyyzz") + " letter pairs.");
		System.out.println( "\"" + "a" +  "\" contains " + CountPairs.pairCounter("a") + " letter pairs.");
		System.out.println( "\"" + "abc" +  "\" contains " + CountPairs.pairCounter("abc") + " letter pairs.");
		System.out.println( "\"" + "aabb" +  "\" contains " + CountPairs.pairCounter("aabb") + " letter pairs.");
		System.out.println( "\"" + "dogcatpigaabbcc" +  "\" contains " + CountPairs.pairCounter("dogcatpigaabbcc") + " letter pairs.");
		System.out.println( "\"" + "aabbccdogcatpig" +  "\" contains " + CountPairs.pairCounter("aabbccdogcatpig") + " letter pairs.");
		System.out.println( "\"" + "dogabbcccatpig" +  "\" contains " + CountPairs.pairCounter("dogabbcccatpig") + " letter pairs.");
		System.out.println( "\"" + "aaaa" +  "\" contains " + CountPairs.pairCounter("aaaa") + " letter pairs.");
		System.out.println( "\"" + "AAAAAAAAA" +  "\" contains " + CountPairs.pairCounter("AAAAAAAAA") + " letter pairs.");
	}
}  