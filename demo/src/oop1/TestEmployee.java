package oop1;

class Employee {
	protected String name;
	protected int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}
}

class Manager extends Employee {
	protected int hra;

	public Manager(String name, int salary, int hra) {
		super(name, salary);
		this.hra = hra;
	}

	@Override
	public int getSalary() {
		return super.getSalary() + this.hra;
	}

	public int getHra() {
		return hra;
	}
}

public class TestEmployee {
	public static void main(String args[]) {
		Employee e = new Employee("James", 100000);
		//e = new Manager("Larry", 150000, 50000);  // Upcasting
		if(e instanceof Manager) {
		   Manager m = (Manager) e;  // Downcasting
		}

	}
}
