package com.Idfc.entity;

public class User {
	
	//creating private variable to store user data
	private int accNo = 1001;
	private String passwd = "Pawar2001";
	private String name = "Prathamesh Pawar";
	private int accBal = 40000;
	
//	Creating getters and setters for accessing above data.
	public int getAccNo() {
		return accNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getName() {
		return name;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
}