package com.bankProject;

import java.util.Scanner;

public class BankAccountUtility {

	// Open a new customer account
	public static void openAccount(BankAccount[] arr) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter account number : ");
		String accno = inp.next();
		System.out.println("Enter Name : ");
		String name = inp.next();
		System.out.println("Enter Balance : ");
		double balance = inp.nextDouble();

		System.out.println("\nChoose Account type :\n1.Saving \n2.Recuring \n3.Current \n4.Exit");
		int acc_code = inp.nextInt();

		AccountType accType = null;

		switch (acc_code) {
		case 1:
			accType = AccountType.Saving;
			arr[BankAccount.getCounter()] = new BankAccount(accno, name, balance, accType);
			System.out.println("Account open successfully");
			break;
		case 2:
			accType = AccountType.Recurring;
			break;
		case 3:
			accType = AccountType.Current;
			break;
		default:
			System.out.println("Invalid option!");
		}
	}

	// Deposit amount to the account
	public static void DepositCash(BankAccount[] arr) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter account number : ");
		String accno = inp.next();

		for (int i = 0; i < arr.length; i++) {
			if (accno.equals(arr[i].getAccno())) {
				System.out.println("Enter amount to deposit : ");
				double amt = inp.nextDouble();
				String res = arr[i].deposit(accno, amt);
				System.out.println(res);
			} else {
				System.out.println("Incorrect account number");
			}
			break;
		}
	}

	// Withdraw amount from account
	public static void WithdrawCash(BankAccount[] arr) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter account number : ");
		String accno = inp.next();

		for (int i = 0; i < arr.length; i++) {
			if (accno.equals(arr[i].getAccno())) {
				System.out.println("Enter amount to withdraw : ");
				double amt = inp.nextDouble();
				String res = arr[i].withdraw(accno, amt);
				System.out.println(res);
			} else {
				System.out.println("Incorrect account number");
			}
			break;
		}
	}

	// Retrive indivisual customer details
	public static void getCustomerDetails(BankAccount[] arr) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter account number : ");
		String accno = inp.next();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				if (accno.equals(arr[i].getAccno())) {
					System.out.println(arr[i].toString());
				}
			}
		}
	}

//	Display all customer details
	public static void DisplayAllCustomer(BankAccount[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.println(arr[i]);
			else
				break;
		}
	}
}
