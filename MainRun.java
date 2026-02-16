package com.learning;

public class MainRun {
	
	public static void main(String[] args) {
		
		System.out.println("===Savings account===");
		SavingsAccount savings = new SavingsAccount("SAVE123", 1000);
		savings.checkBalance();
		savings.deposit(500);
		savings.calculateInterest();
		savings.withdraw(200);
		savings.checkBalance();
		
		System.out.println("\n===Checking account===");
		CheckingAccount checking = new CheckingAccount("CHK546", 500);
		checking.checkBalance();
		checking.withdraw(600);
		checking.calculateInterest();
		checking.checkBalance();
	}
}
