package com.learning;
	
abstract class BankAccount {
	
	protected String accountNumber;
	protected double balance;
	
	// constructor for BankAccount
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	public void deposit(double amount) {	
		if (amount > 0) {
			
			balance += amount;
			System.out.println("Deposited amount: "+amount);
		}
	}
	
	public void checkBalance() {
		System.out.println("Your account balance is: "+balance);
	}
	
	abstract public void withdraw(double amount);
	
	abstract public void calculateInterest();
}
