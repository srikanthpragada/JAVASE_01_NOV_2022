package coll;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteSortedNames {

	public static void main(String[] args) throws Exception {
		var names = new ArrayList<String> ();
		var s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter name [end to stop] :");
			String name = s.nextLine();
			if (name.equals("end"))
				break;
			names.add(name);
		}

		names.sort(null);

		// open file names.txt
		try (var fw = new FileWriter("d:\\classroom\\nov1j\\names.txt")) {
			for (var n : names)
				fw.write(n + "\n");
		}

		s.close();
	}

}
