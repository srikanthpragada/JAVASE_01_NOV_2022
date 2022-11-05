package basics;

public class FunsDemo {

	public static int square(int num) {
		return num * num;
	}

	public static int add(int ... nums) {
		 
		int total = 0;
		for(int n : nums)
			total += n;
		
		return total;
	}

	public static void main(String[] args) {

		System.out.println(square(10));
		System.out.println(add(10, 20));
		System.out.println(add(10, 20, 30));
		System.out.println(add(10, 20, 40, 50, 60));
	}

}
