package org.Functionality;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.Tester.AccountHolder_NameComparator;
import org.domain.Bank;

interface RohitAndPooja {
	void addAccount(Bank bank);

	void deposit();

	void withdraw();

	default void acceptRecord(int[] number) {

	}

	default void printRecord(Bank bank1) {

	}
}

public class ListTest implements RohitAndPooja {
	static Random rd = new Random();

	private static Scanner sc = new Scanner(System.in);

	Bank bank = new Bank();

	private List<Bank> bankList;

	// private double balance;
	public ListTest() {
		this.bankList = new ArrayList<>();
	}

	@Override
	public void addAccount(Bank bank) {
		bankList.add(bank);
	}

	public static Bank acceptBankDetails() {
		Bank bank = new Bank();

		try {

			System.out.print("Enter Account holder  name	:	");
			bank.setCustomer_name(sc.nextLine());
			System.out.print("Enter Contact Number	:	");
			bank.setContact_no(sc.nextLine());
			System.out.print("Enter Initial Balance	:	");
			bank.setBalance(sc.nextDouble());
			System.out.print("Enter Account Type	:	");
			sc.nextLine();
			bank.setType(sc.nextLine());
			System.out.print("Generate account no	:	");
			bank.setAccount_no(rd.nextInt(100));
			System.out.println(bank.getAccount_no());
		} catch (Exception e) {

			e.printStackTrace();
		}

		return bank;

	}

	public void acceptRecord(int[] number) {
		if (number != null) {
			System.out.print("Enter Account Number:	");
			number[0] = sc.nextInt();
		}
	}

	public void printRecord(Bank bank1) {
		if (bank1 != null)
			System.out.println(bank1.toString());
		else
			System.out.println("Account not found.");
	}

	public Bank findAccount(int bank1) {
		if (this.bankList != null) {
			Bank key = new Bank();
			key.setAccount_no(bank1);
			if (this.bankList.contains(key)) {
				int index = this.bankList.indexOf(key);
				Bank value = this.bankList.get(index);
				return value;
			}
		}
		return null;
	}

	public boolean removeAccount(int number) {
		if (this.bankList != null) {
			Bank key = new Bank();
			key.setAccount_no(number);
			if (this.bankList.contains(key)) {
				this.bankList.remove(key);
				return true;
			}
		}
		return false;

	}

	public static void printRecord(boolean deleteStatus) {
		if (deleteStatus)
			System.out.println("Account is deleted");
		else
			System.out.println("Account not found.");
	}

	public void withdraw() {
		if ((this.bankList) != null) {
			System.out.println("Enter the Account number ");
			int AccNo = sc.nextInt();
			for (Bank bank : bankList) {
				if (AccNo == bank.getAccount_no()) {
					System.out.println("Enter Amount you want to withdraw");
					double amount = sc.nextDouble();
					if (bank.getBalance() >= amount) {
						bank.setBalance(bank.getBalance() - amount);

						System.out.println("Balance after withdrawl " + bank.getBalance());

					} else
						System.out.println("Insufficient balance!");

				} else
					System.out.println("Your Account Number is Incorrect :");
			}
		}
	}

	public void deposit() {
		if ((this.bankList) != null) {
			System.out.println("Enter the Account number ");
			int AccNo = sc.nextInt();
			for (Bank bank : bankList) {
				if (AccNo == bank.getAccount_no()) {
					System.out.println("Enter Amount you want to deposit");
					double amount = sc.nextDouble();
					bank.setBalance(bank.getBalance() + amount);
					System.out.println("Balance after deposit " + bank.getBalance());
				}
			}
		}
	}

	public void sortAccountNumber() {
		Collections.sort(bankList);
	}

	public void sortAccountName() {
		Collections.sort(bankList, new AccountHolder_NameComparator());
	}

	public void printAccount_Details() {
		if (this.bankList != null) {

			this.bankList.forEach(System.out::println);
		}

	}

}
