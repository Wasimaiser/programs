package com.account;

import java.util.Scanner;

public class Account 
{
	int  acctId,acctBalance;
	String acctType;

	public void deposit(int amount)
	{
if(amount>0)
{
	acctBalance=acctBalance+amount;
	System.out.println("Amount Deposited Successfully..!:"+" total Balance"+" Rs  "+acctBalance);
}
else
{
	System.out.println("you Entered wrong Desopit Amount");
}
	}
public void withdraw(int amount)
{
	if(amount>0 &&amount<=acctBalance)
	{
		acctBalance=acctBalance-amount;
		System.out.println("Amount withdrawan Successfully..! "+" "+"Available Balance"+" Rs "+acctBalance);
	}
	else
	{
		System.out.println("Insufficient Balance"+" "+"Available Balance"+" Rs  "+acctBalance);
	}
}
public int getBalance()
{
	System.out.println("your Account balance is:-  Rs  "+acctBalance);
	return acctBalance;
	
			
}
public void display()
{
	 System.out.println("ID: " + acctId);
     System.out.println("Account Type: " + acctType);
     System.out.println(" Balance: " + acctBalance);
}
public int getAcctId() {
	return acctId;
}
public void setAcctId(int acctId) {
	this.acctId = acctId;
}
public int getAcctBalance() {
	return acctBalance;
}
public void setAcctBalance(int acctBalance) {
	this.acctBalance = acctBalance;
}
public String getAcctType() {
	return acctType;
}
public void setAcctType(String acctType) {
	this.acctType = acctType;
}
public Account(int acctId, int acctBalance, String acctType) {
	super();
	this.acctId = acctId;
	this.acctBalance = acctBalance;
	this.acctType = acctType;
}

}
