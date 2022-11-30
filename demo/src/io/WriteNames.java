package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		 String [] names = {"Andy" ,"Larry", "Ben","Jack","Kevin"};
		 
		 FileWriter fw = new FileWriter("d:\\classroom\\nov1j\\names.txt");
		 
		 for(var n : names)
			 fw.write(n + "\n");
		 
		 fw.close();

	}
}
