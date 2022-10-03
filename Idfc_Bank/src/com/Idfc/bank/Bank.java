package com.Idfc.bank;

import com.Idfc.entity.User;

public class Bank {
//	Creating User object to access getters and setters for transactions
	User user = new User();
	
//	This method return name
	public String Cust_Name() {
		return user.getName();
	}
	
//	This method displays balance
	public void balance() {
		System.out.println("Your account balance is, " + user.getAccBal());
	}
	
//	This method deposit amount and display updated balance
	public void deposit(int amount) {
		int bal=user.getAccBal() + amount;
		user.setAccBal(bal);
		System.out.println("Amount deposited Sucessfully");
		System.out.println("Your account balance is, " + user.getAccBal());
	}
	
//	This method withdraw amount and display updated balance
	public void withdraw(int amount) {
		int bal=user.getAccBal() - amount;
		user.setAccBal(bal);
		System.out.println("Amount withdrawn Sucessfully");
		System.out.println("Your account balance is, " + user.getAccBal());
	}
	
//	This method transfer amount and display updated balance
	public void transfer(int amount, int accNo) {
		int bal=user.getAccBal() - amount;
		user.setAccBal(bal);
		System.out.println("Amount Transferred Sucessfully to " + accNo);
		System.out.println("Your account balance is, " + user.getAccBal());
	}
	
//	This method verifies User credentials
	public boolean verify(int accNo, String pass) {
		if((accNo==user.getAccNo() && pass.equals(user.getPasswd()))){
			return true;
		}
		return false;
	}

}