package advanced;

@FunctionalInterface 
interface Task {
	void process();
}

class MyTask implements Task {
	public void process() {
		System.out.println("MyTask....");
	}
}

public class LambdaDemo {
	
	public static void print() {
		 for(int i = 10; i <= 15; i ++)
			  System.out.println(i);
	}

	public static void main(String[] args) {
		 Task t = new MyTask();
		 t.process();
		 
		 Task t2 = new Task() {
			public void process() {
			      System.out.println("Anonymous class");	
			}
		 };
		 //System.out.println(t2.getClass());
		 t2.process();
		 
		 // Lambda Expression 
		 Task t3 = () -> System.out.println("Lambda Expression");
		 //System.out.println(t3.getClass());
		 t3.process();
		 
		 // Lambda Block
		 Task t4 = () -> {
			 for(int i = 1; i <= 5; i ++)
				  System.out.println(i);
		 };
	
		 t4.process();
		 
		 // Method reference 
		 Task t5 = LambdaDemo::print;
		 t5.process();
	}
}
