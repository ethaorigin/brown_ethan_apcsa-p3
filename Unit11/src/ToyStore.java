//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		toys += " ";
		List<String> NameList = new ArrayList<String>();
		int startIndex = 0;
		for(int n = 0; n<toys.length(); n++) {
			if(toys.substring(n, n + 1).contentEquals(" ")) {
				NameList.add(toys.substring(startIndex, n));
				startIndex = n + 1;
			}
		}
		
		
		ArrayList<Toy> toysList = new ArrayList<Toy>();
		
		for(int n = 0; n<NameList.size(); n++) {
			boolean check = false;
			for(int k = 0; k<n; k++) {
				if(NameList.get(n).equals(NameList.get(k))) {
					check = true;
				}
			}
			
			int num = 0;
			if(!check) {
				for(String str : NameList) {
					if(str.equals(NameList.get(n))) {
						num++;
					}
				}
				Toy thing = new Toy(NameList.get(n));
				thing.setCount(num);
				toysList.add(thing);
			}
		}
		toyList = toysList;
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(Toy ty : toyList) {
  			if(ty.getName().contentEquals(nm)) {
  				return ty;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy max = new Toy();
  		
  		for(Toy ty:toyList) {
  			if(ty.getCount()>max.getCount()) {
  				max = ty;
  			}
  		}
  		return max.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int n = 0; n<toyList.size(); n++) {
  			for(int k = 0; k<toyList.size()-1; k++) {
  				if(toyList.get(k).getCount()<toyList.get(k+1).getCount()) {	
  					Toy a = new Toy(toyList.get(k).getName());
  					a.setCount(toyList.get(k).getCount());
  					
  					Toy b= new Toy(toyList.get(k+1).getName());
  					b.setCount(toyList.get(k+1).getCount());
  				
  					toyList.set(k, b);
  					toyList.set(k + 1,  a);
  				
  				}
  			}
  		}
  		System.out.println(toyList);
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}