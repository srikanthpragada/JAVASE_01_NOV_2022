package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ListPersons {

	public static boolean ageMoreThan18(String dobstr) {
		//System.out.println(dobstr);
		try {
			LocalDate dob = LocalDate.parse(dobstr);
			LocalDate cd = LocalDate.now();
			long years = ChronoUnit.YEARS.between(dob, cd);
			//System.out.println(years);
			return years > 18;
		} catch (Exception ex) {
			//System.out.println(ex);
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		Path p = Path.of("d:\\classroom\\nov1j\\dob.txt");

		Files.lines(p)
		     .filter(ListPersons::ageMoreThan18)
		     .forEach(System.out::println);
	}

}
