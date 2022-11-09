package oop1;

public class Account {
	// Instance variable 
    private int acno;
    private String ahname;
    private double balance;
    private static int minbal = 5000;
    
    // Constructor 
    public Account(int acno, String ahname) {
    	this.acno = acno;
    	this.ahname = ahname;
    	this.balance = 0;
    }
    
    public Account(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor 
		this.balance = balance;
	}

	public void print() {
    	System.out.println(this.acno);
    	System.out.println(this.ahname);
    	System.out.println(this.balance);
    }
    
    public void deposit(double amount) {
    	this.balance += amount; 
    }
    
    public void withdraw(double amount) {
    	this.balance -= amount; 
    }
}
