package com.bankProject;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
		Scanner inp = new Scanner(System.in);
		BankAccount[] carr = new BankAccount[3];

		while (true) {
			System.out.println("\nPlease select the option :\n1.Open Account \n2.Cash Deposit \n3.Cash Withdraw \n4.Get Customer Details \n5.Show all Customer");
			int choice=inp.nextInt();
			switch (choice) {
			case 1:
				BankAccountUtility.openAccount(carr);
				break;
			case 2:
				BankAccountUtility.DepositCash(carr);
				break;
			case 3:
				BankAccountUtility.WithdrawCash(carr);
				break;
			case 4:
				BankAccountUtility.getCustomerDetails(carr);
				break;
			case 5:
				BankAccountUtility.DisplayAllCustomer(carr);
				break;
			default:
				System.out.println("Invalid Option!");
			}
		}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
