package assignments;

import java.io.BufferedReader;
import java.io.FileReader;

public class ShowTotalMarks {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("d:\\classroom\\nov1j\\marks.txt");
		var br = new BufferedReader(fr);

		while (true) {
			var line = br.readLine();
			if (line == null)
				break;

			var parts = line.split(",");
			// if not found required details, ignore line
			if (parts.length < 2)
				continue;

			
			var rollno = parts[0]; // first part is rollno
			// Get total for marks which are in the form of Strings
			var total = 0;
			//var done = true;
			for (int i = 1; i < parts.length; i++) {
				try {
					total += Integer.parseInt(parts[i]);
				} catch (Exception ex) {
                   // done = false;
                   // break;
				}
			}

			//if(done)
			   System.out.printf("%2s - %3d\n", rollno, total);
		}

		fr.close();
	}

}
