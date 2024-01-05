package com.account.test;

import java.util.Scanner;

import com.account.Account;

public class AccountMain 
{
	public static void main(String[] args) 
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		 Account account = new Account(123, 1000, "Savings");
		 try
		 {
		 do
		 {
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Display Balance");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");

          choice = sc.nextInt();
         switch (choice) {
         case 1:
             System.out.print("Enter the amount to deposit: ");
             int deposit = sc.nextInt();
             account.deposit(deposit);
             break;
         case 2:
             System.out.print("Enter the amount to withdraw: ");
             int withdraw = sc.nextInt();
             account.withdraw(withdraw);
             break;
         case 3:
             System.out.println("Current Balance: " + account.getBalance());
             break;
         case 4:
             System.out.println("Thanks for using this service");
             break;
 
         default:
             System.out.println("Invalid choice. Please enter a valid option.");
     
         }
		 }
		 while(choice!=4);
		 }
		 catch (Exception e) {
			System.out.println("Something Went Wrong");
		}
	}

}
