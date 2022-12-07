package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.TreeMap;

public class MarksReport {

	public static void main(String[] args) throws IOException {
		var path = Path.of("d:\\classroom\\nov1j\\students.txt");
		var lines = Files.readAllLines(path);

		var students = new TreeMap<Integer, Integer>();

		for (var line : lines) {
			var parts = line.split(",");
			if(parts.length < 2)
				continue; 
			
			try {
				var rollno = Integer.parseInt(parts[0]);
				var marks = Integer.parseInt(parts[1]);
				if (students.containsKey(rollno))
					students.put(rollno, students.get(rollno) + marks);
				else
					students.put(rollno, marks);
			} catch (Exception ex) {
                 
			}
		}

		for (var rollno : students.keySet())
			System.out.printf("%3d - %3d\n", rollno, students.get(rollno));
	}
}
