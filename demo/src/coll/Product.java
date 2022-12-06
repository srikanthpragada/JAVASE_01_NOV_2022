package coll;

public class Product implements Comparable<Product> {
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s - %d", this.name, this.price);
	}

	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		var other = (Product) obj;
		return this.name.equals(other.name) && this.price == other.price;
	}

	@Override
	public int compareTo(Product other) {
		System.out.println("Called");
		return this.price - other.price;
	}
}
