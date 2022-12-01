package assignments;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintSmallLines {

	public static void main(String[] args) throws Exception  {
		 var fr = new FileReader("d:\\classroom\\nov1j\\names.txt");
		 var br = new BufferedReader(fr);
		 
		 while(true) {
			 var line = br.readLine();
			 if(line == null)
				  break;
			 
			 if(line.length() >= 5)
				 System.out.println(line);
		 }
		 
		 fr.close();
	}

}
