package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class SortCustomers {

	public static void main(String[] args) throws IOException {
		 Path file = Path.of("d:\\classroom\\nov1j\\customers.txt");
		 var lines = Files.readAllLines(file);
		 Pattern mobilePattern = Pattern.compile("\\d+");
		 Pattern namePattern = Pattern.compile("[a-zA-Z ]+");
		 
		 var customers = new TreeMap<String,String>();
		 
		 for (var line : lines)
		 {
			 var matcher = mobilePattern.matcher(line);
			 if (!matcher.find())
				 continue; // ignore as mobile is not found
			 
			 var mobile = matcher.group();
			
			 matcher = namePattern.matcher(line);
			 if (!matcher.find())
				 continue; // ignore as name is not found
			 
			 var name = matcher.group().trim();
			 // add to map 
			 customers.put(name, mobile);
		 }
		 
		 for(var name : customers.keySet()) {
			 System.out.printf("%-20s %s\n",  name, customers.get(name));
			 
		 }

	}

}
