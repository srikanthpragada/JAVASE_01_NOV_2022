package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedWordsWithRE {

	public static void main(String[] args) throws IOException {
		var path = Path.of("d:\\classroom\\nov1j\\test.txt");
		var lines = Files.readAllLines(path);

		var sortedWords = new TreeSet<String>();

		for (var line : lines) {
			var words = line.split("\\W+");
			sortedWords.addAll(Arrays.asList(words));
		}

		for(var w : sortedWords) 
			System.out.println(w);
	}

}
