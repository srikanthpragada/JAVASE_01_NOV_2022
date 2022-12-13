package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SearchJavaFiles {

	public static boolean hasString(Path path, String search) {
		try {
			if(path.toString().endsWith(".java"))
			     return Files.readString(path).contains(search);
			else
				 return false;
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		Path start = Path.of("d:\\classroom\\nov1j\\demo\\src");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter search string :");
		String search = s.nextLine(); 
		
		Files.walk(start)
		    .filter(p -> SearchJavaFiles.hasString(p, search))
		    .forEach(System.out::println);
       }
}
