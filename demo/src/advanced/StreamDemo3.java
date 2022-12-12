package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamDemo3 {
	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\nov1j\\names.txt");
		
		var count= 
		      Files.lines(p)
		     .filter(n -> n.toUpperCase().contains("S"))
		     .count();
		
		System.out.println(count);
		     
	}

}
