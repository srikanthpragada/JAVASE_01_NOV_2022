package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames2 {

	public static void main(String[] args) throws Exception {
		String[] names = { "Andy", "Larry", "Ben", "Jack", "Kevin" };

		// try with resources
		try (FileWriter fw = new FileWriter("d:\\classroom\\nov1j\\names.txt")) {
			for (var n : names)
				fw.write(n.toUpperCase() + "\n");
		}
	}
}
