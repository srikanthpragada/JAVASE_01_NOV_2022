package advanced;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		//System.out.println("compare");
		return s1.length() - s2.length();
	}
}

public class StringsSortingWithLambda {

	public static int compareStrings(String s1, String s2) {
		return s1.toUpperCase().compareTo(s2.toUpperCase());
	}
	
	public static void main(String[] args) {
		 var names = new String[] {"java","c","C#","Ruby","Python"};
		 
		 //Arrays.sort(names, new LengthCompare());
		 //Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());
		 
		 Arrays.sort(names, StringsSortingWithLambda::compareStrings);
		 
		 for(var n : names)
			 System.out.println(n);

	}

}
