package coll;

import java.time.LocalDate;
import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var al = new ArrayList<String>();

		al.add("abc");
//		al.add(10);
//		al.add(LocalDate.now());

		String s =  al.get(0);

	}

}
