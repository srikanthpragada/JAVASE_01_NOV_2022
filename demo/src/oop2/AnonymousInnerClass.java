package oop2;

interface Process {
	void print();
}

class MyProcess implements Process  {
	@Override
	public void print() {
	
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		 Process p = new MyProcess();
		 p.print(); 
		 
		 p = new Process() {
			@Override
			public void print() {

			}
		 };
		 
		 System.out.println(p.getClass());
		 p.print(); 

	}

}
