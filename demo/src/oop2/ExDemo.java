package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String s = "10a";
		try {
			int n = Integer.parseInt(s);
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid number!");
		} catch (ArithmeticException ex) {
			System.out.println("Number cannot be 0!");
		}
	}

}
