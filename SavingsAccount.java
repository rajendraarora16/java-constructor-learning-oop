package com.learning;

public class SavingsAccount extends BankAccount {
	
	private double interestRate = 0.05;
	
	public SavingsAccount(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (amount <= balance) {
			
			// savings withdraw limit only 500..
			if (amount <= 500) {
				
				balance -= amount;
				System.out.println("Withdrew : "+amount+" from savings.");
			} else {
				System.out.println("Insufficient balance..");
			}
		}
	}
	
	@Override
	public void calculateInterest() {
		double interest = balance * interestRate;
		balance += interest;
		
		System.out.println("Interest earned: "+balance);
	}
}
