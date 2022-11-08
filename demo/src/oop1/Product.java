package oop1;

public class Product {
	private int id;
	private String name;
	private int price;

	public void init(int pid, String pname, int p) {
		id = pid;
		name = pname;
		price = p;
	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}

	public int getNetPrice() {
		return price + price * 12 / 100;
	}
}
