package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UniqueLongNames {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\nov1j\\names.txt");
		
		Files.lines(p)
		     .filter(s ->  s.length() > 4)
		     .distinct()
		     .sorted()
		     .forEach(System.out::println);
		     
	}

}
