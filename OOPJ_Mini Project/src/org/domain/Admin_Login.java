package org.domain;
import java.util.Scanner;
import org.Functionality.*;
public class Admin_Login {
	
	
	    int admin_id = 1234;
	    int admin_pass = 9999;
	    int ac;
	    int pw;
	    public void acceptInput(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the admin id:");
	        ac = scanner.nextInt();
	        System.out.println("Enter the Password:");
	        pw = scanner.nextInt();
	    }
	    public void verify() throws Exception{
	         
	        if(ac == admin_id && pw == admin_pass)
	        {
	            System.out.println("Login Successfull!");
	            Bank bank = new Bank();
	            System.out.println(" ");
	            
	        }else{
	            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect login credentials");
	            System.out.println(loginfailed.getMessage());
	            throw loginfailed;
	        }
	    }
	}

