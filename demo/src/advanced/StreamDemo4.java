package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo4 {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\nov1j\\scores.txt");
		
		Files.lines(p)
		     .mapToInt(v -> Integer.parseInt(v))
		     .filter(v -> v > 50)
		     .sorted()
		     .forEach(System.out::println);
	}

}
