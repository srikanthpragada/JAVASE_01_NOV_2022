package oop1;

public class Product {
	// Instance variables 
	private int id;
	private String name;
	private int price;
	private static int taxrate = 12; // class variable 

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);
	}

	public int getNetPrice() {
		return price + price * Product.taxrate / 100;
	}
	
	public static int getTaxRate() {
		return  Product.taxrate; 
	}
}
