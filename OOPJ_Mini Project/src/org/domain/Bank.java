package org.domain;
import org.Functionality.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Bank implements Comparable<Bank> {
	
	int account_no;
	String Customer_name;
	String Contact_no;
	double balance;
	String type;
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int account_no, double balance, String type, String customer_name, String contact_no) {
		super();
		this.account_no = account_no;
		Customer_name = customer_name;
		Contact_no = contact_no;
		this.balance = balance;
		this.type = type;

	}
private static Scanner sc = new Scanner(System.in);
	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double d) {
		this.balance = d;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}

	public String getContact_no() {
		return Contact_no;
	}

	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account_no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return account_no == other.account_no;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-20s%-20s%-10.2f%-15s", this.account_no, this.Customer_name, this.Contact_no,
				this.balance, this.type);
	}

	@Override
	public int compareTo(Bank o) {
		
		return this.account_no-o.account_no;
	}
}
	/*public void withdraw() {
		System.out.println("Enter Amount you want to withdraw");
		double amount = sc.nextDouble();
		 if (balance >= amount) {
			 balance = this.balance-amount;
		
			 System.out.println("Balance after withdrawl"+balance);
		 
		 }      
	      else 
	        	 System.out.println("Insufficient balance!");
	           
	            
}

	public void deposit() {
		System.out.println("Enter Amount you want to deposit");
		double amount = sc.nextDouble();
			balance = this.balance + amount;
		System.out.println("Balance after deposit "+balance);
	}
	
	} 
   
	 */

		
			


