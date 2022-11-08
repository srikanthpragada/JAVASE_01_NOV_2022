package oop1;

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.init(1, "iPhone 14 Pro", 130000);
		
		p1.print();
		System.out.println(p1.getNetPrice());
		
	}

}
