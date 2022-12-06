package coll;

import java.util.TreeSet;

public class ListProducts {
	public static void main(String[] args) {
		 var products = new TreeSet<Product>();
		 products.add(new Product("p1", 1000));
		 products.add(new Product("p2", 2000));
		 products.add(new Product("p1", 1000));
		 products.add(new Product("p3", 3000));
		 
		 for(var p : products) {
			 System.out.println(p);
			 //System.out.println(p.hashCode());
		 }
	}
}

