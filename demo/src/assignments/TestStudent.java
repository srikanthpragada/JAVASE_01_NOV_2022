package assignments;

class InvalidCourseException extends Exception {
	public InvalidCourseException(String name) {
		super("Invalid course -->" + name);
	}
}

class ExcessFeeException extends Exception {
	public ExcessFeeException() {
		super("Excess fee is being paid");
	}
}

class Student {
	private String name, course;
	private int feePaid;
	private static String[] courses = { "java", "spring", "react" };
	private static int[] fees = { 10000, 20000, 8000 };

	public Student(String name, String course, int feePaid) throws InvalidCourseException {
		super();
		this.name = name;
		if (!(course.equals("java") || course.equals("spring")))
			throw new InvalidCourseException(course);

		this.course = course;
		this.feePaid = feePaid;
	}

	private int getTotalFee() {
		return this.course.equals("java") ? 10000 : 20000;
	}

	public void payment(int amount) throws ExcessFeeException {
		if (this.feePaid + amount > this.getTotalFee())
			throw new ExcessFeeException();
	}

}

public class TestStudent {

	public static void main(String[] args) throws Exception {
		Student s = new Student("Scott", "javaee", 5000);
		s.payment(6000);
	}

}
