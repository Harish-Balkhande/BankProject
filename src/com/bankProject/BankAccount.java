package com.bankProject;

public class BankAccount {
	private String accno;
	private String name;
	private double balance;
	private AccountType type;
	
	static int counter=0;
	
	//constructor to create customer account and increment the static counter on account creation 
	public BankAccount(String accno,String name,double balance,AccountType type) {
		counter++;
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		this.type=type;
	}
	
	//returns the account number
	public String getAccno() {
		return accno;
	}
	
	//static method to get counter value
	static int getCounter() {
		return BankAccount.counter;
	}
	
	//Withdraw operation
	public String withdraw(String accno, double amt) {
			if(amt<this.balance) {
				this.balance-=amt;
				return "\nAmount debited = "+amt+" \nBalance = "+this.balance;
			}else {
				return "Insufficent balance!";
			}
	}
	
	//Deposit operation
	public String deposit(String accno, double amt) {
			this.balance+=amt;
			return "\nAmount of Rs "+amt+" is created to account : "+this.accno;
	}
	
	//show account details
	@Override
	public String toString() {
		return "\nAccount Details \naccno=" + this.accno + "\nname=" + this.name + "\nbalance=" + this.balance;
	}	
}
