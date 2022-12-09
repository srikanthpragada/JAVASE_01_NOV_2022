package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ReplaceMultipleSpacesWithOne {

	public static void main(String[] args) throws IOException {
		var path = Path.of("d:\\classroom\\nov1j\\test.txt");
		var contents = Files.readString(path);
		
		var pattern = Pattern.compile(" +");
		var matcher = pattern.matcher(contents);
		
		var newcontents = matcher.replaceAll(" ");
		//System.out.println(newcontents);
		
		Files.writeString(path, newcontents);
	}

}
