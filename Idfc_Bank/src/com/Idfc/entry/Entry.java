package com.Idfc.entry;

import java.util.Scanner;

import com.Idfc.bank.Bank;
import com.Idfc.exception.InvalidCredits;

public class Entry {
	
public static void main(String[] args) throws InvalidCredits {
	Scanner sc = new Scanner(System.in);
	Bank bank = new Bank();
	
	System.out.println("* _______________ Welcome to Bank _______________ *\n");
	System.out.print("Enter your account number:- ");
	int accNo = sc.nextInt();
	System.out.print("Enter your password:- ");
	String password = sc.next();
	boolean chk = true;
		

	// Checking user input matches with user data 
	if(bank.verify(accNo, password) == true) {
		System.out.println("\nWelcome, " + bank.Cust_Name() + "\n");
		while(chk) {
			System.out.println("1. View Balance \n2. Deposit Amount \n3. Withdraw Amount \n4. Transfer Amount \n5. Exit \n");
			System.out.print("Enter operation to perform:- ");
			switch(sc.nextInt()) {
				case 1: {
				bank.balance();
				System.out.println();
				break;
				}
				case 2: {
				bank.balance();
				System.out.print("Enter amount to Deposit:- ");
				bank.deposit(sc.nextInt());
				System.out.println();
				break;
				}
				case 3: {
				bank.balance();
		 		System.out.print("Enter amount to Withdraw:- ");
				bank.withdraw(sc.nextInt());
				System.out.println();
				break;
				}
				case 4: {
				bank.balance();
				System.out.print("Enter amount to Transfer:- ");
				int amount = sc.nextInt();
				System.out.print("Enter account number of receiver:-");
				int acc = sc.nextInt();
				bank.transfer(amount, acc);
				System.out.println();
				break;
				}
				case 5: {
				System.out.println("Thanks for visiting !!!");
				chk=false;
				break;
				}
				default: {
				System.out.println("Enter valid input !!");
				System.out.println();
				}
				}
			
			}
		
		}else {
			sc.close();
			throw new InvalidCredits("Invalid Credits ! Provide vaid inputs !!");
		}
	
		
		sc.close();
	
}

}
