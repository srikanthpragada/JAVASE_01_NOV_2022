package lib1;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override 
	public String toString() {
		return  this.name + " : " + this.age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		//this.name  
		return false;
	}
}

public class TestPerson {
	public static void main(String[] args) {
		var p1 = new Person("James", 60);
		var p2 = new Person("James", 60);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
	}
}
