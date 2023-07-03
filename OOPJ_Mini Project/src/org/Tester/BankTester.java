package org.Tester;

import java.util.Scanner;
import org.domain.*;
import org.Functionality.*;

enum operation {
	EXIT, ADD, FIND, DELETE, WITHDRAW, DEPOSIT, DISPLAY
}

enum sorting {
	EXIT, Acc_NUMBER, NAME
}

public class BankTester {
	private static Scanner sc = new Scanner(System.in);

	public static operation menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Account(s)");
		System.out.println("2.Find Account");
		System.out.println("3.Delete Account");
		System.out.println("4.Withdraw Ammount from Account ");
		System.out.println("5.Deposit Ammount in Account ");
		System.out.println("6.Print Account Details[Sorted]");
		System.out.print("Enter choice	:	");
		int choice = sc.nextInt();
		return operation.values()[choice];

	}

	public static sorting subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Compare By Account number");
		System.out.println("2.Compare By Account Holder name");
		System.out.print("Enter choice	:	");
		int op = sc.nextInt();
		return sorting.values()[op];
	}

	public static void main(String[] args) {

		Banking b = new Banking();
		b.initiate();
		System.out.println();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("$$$                                           $$$");
		System.out.println("$$$           WELCOME TO THE BANK             $$$");
		System.out.println("$$$                                           $$$");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();

		// Banking banking = new Banking();
		operation choice;

		int[] number = new int[1];
		ListTest test = new ListTest();

		while ((choice = BankTester.menuList()) != operation.EXIT) {
			switch (choice) {
			case ADD:

				Bank bank = ListTest.acceptBankDetails();
				test.addAccount(bank);

				break;
			case FIND:
				test.acceptRecord(number);
				Bank bank1 = test.findAccount(number[0]);
				test.printRecord(bank1);
				break;
			case DELETE:
				test.acceptRecord(number);
				boolean deleteStatus = test.removeAccount(number[0]);
				ListTest.printRecord(deleteStatus);
				break;
			case WITHDRAW:

				test.withdraw();

				break;

			case DEPOSIT:

				test.deposit();
				break;
			case DISPLAY:
				sorting op;
				while ((op = BankTester.subMenuList()) != sorting.EXIT) {

					switch (op) {
					case Acc_NUMBER:
						test.sortAccountNumber();
						test.printAccount_Details();
						break;
					case NAME:
						test.sortAccountName();
						test.printAccount_Details();
						break;

					}

				}
				break;
			}
		}

	}
}
