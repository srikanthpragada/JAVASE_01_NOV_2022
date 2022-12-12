package advanced;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo1 {
	public static void main(String[] args) {
		int a[] = { 10, 11, 24, 45, 48, 32, 11, 23, 67, 90 };
		/*
		ArrayList<Integer> nums = new ArrayList<>();
		for (int n : a)
			if (n % 2 == 0)
				nums.add(n);

		nums.sort(null);
		for(int n : nums)
			System.out.println(n);  */
		
		Arrays.stream(a)
		      .filter( n -> n % 2 == 0)  // Predicate (boolean test(value))
		      .sorted()
		      .forEach(System.out::println); // Consumer(void accept(value))

	}

}
