package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {
	private static int count = 0;
	
	public static void display(Path p) {
		count ++;
		System.out.println(p);
	}
    
	public static void main(String[] args) throws IOException {
		Path start = Path.of("d:\\classroom\\nov1j\\demo\\src");
		Files.walk(start)
		    .filter(p -> p.toString().endsWith(".java"))
		    .forEach(ListJavaFiles::display); 

		System.out.println(count);
	}
}
