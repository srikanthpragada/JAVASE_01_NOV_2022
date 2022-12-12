package advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo2 {
	public static void main(String[] args) {
		int a[] = { 10, 11, 24, 45, 48, 32, 11, 23, 67, 90 };

		var avg = Arrays.stream(a).average().getAsDouble();
		System.out.println(avg);
		Arrays.stream(a)
		      .filter(n -> n > avg)
		      .sorted()
		      .limit(3)
		      .forEach(System.out::println);
		
		
		
		
		
		


	}

}
