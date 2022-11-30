package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListNames {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\nov1j\\names.txt");
		var br = new BufferedReader(fr);
		
		while(true) {
			var line = br.readLine();
			if(line == null)  // EOF
				break;
			
			if(line.startsWith("A"))
				System.out.println(line);
		}
		fr.close();
		br.close();
	}

}
