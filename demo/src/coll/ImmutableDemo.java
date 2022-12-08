package coll;

import java.util.List;

public class ImmutableDemo {

	public static void main(String[] args) {
		var names = List.of("Java", "JavaScript", "Python");
		System.out.println(names.getClass());

	}

}
