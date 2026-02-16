package com.learning;

public class CheckingAccount extends BankAccount {
	private double overdraftLimit = 100;
	
	public CheckingAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (amount <= balance + overdraftLimit) {
			
			balance -= amount;
			System.out.println("Withdrew: "+amount+" from checking");
		}
		
		if (balance < 0) {
			
			System.out.println("Using overdraft: balance: "+balance);
		} else {
			
			System.out.println("Exceeds overdraft limit");
		}
	}
	
	@Override
	public void calculateInterest() {
		System.out.println("Checking account doesn't earn interest");
	}
}
