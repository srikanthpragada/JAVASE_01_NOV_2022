package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.TreeMap;

public class ShowMarks {

	public static void main(String[] args) throws IOException {
		var path = Path.of("d:\\classroom\\nov1j\\students.txt");
		var lines = Files.readAllLines(path);

		var students = new TreeMap<Integer, ArrayList<Integer>>();

		for (var line : lines) {
			var parts = line.split(",");
			if (parts.length < 2)
				continue;

			try {
				var rollno = Integer.parseInt(parts[0]);
				var marks = Integer.parseInt(parts[1]);
				if (students.containsKey(rollno)) {
					var allmarks = students.get(rollno);
					allmarks.add(marks);
					students.put(rollno, allmarks); // update existing entry
				} else {
					var allmarks = new ArrayList<Integer>();
					allmarks.add(marks);
					students.put(rollno, allmarks); // add new entry
				}
			} catch (Exception ex) {

			}
		}

		for (var rollno : students.keySet()) {
			
			System.out.printf("%3d ", rollno);
			
			for (var m : students.get(rollno))
				System.out.printf("%3d", m);
			
			System.out.println();
		}
	}
}
