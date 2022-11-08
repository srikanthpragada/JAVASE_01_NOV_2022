package oop1;

public class TestAccount {

	public static void main(String[] args) {
		 Account a1;  // object reference 
		 
		 a1 = new Account(101, "Mark");
		 a1.deposit(10000);
		 a1.deposit(20000);
		 a1.print();
		 
		 Account a2 = new Account(2, "Jack");
		 a2.print();
		 
	}

}
