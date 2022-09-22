package com.Pillers;

public class Account {

	int acct_num;
	String acct_type;
	int acct_balance=0;
	int deposite_amt;
	
	void acceptDetails(int n,String t,int b)
	{
		acct_num=n;
		acct_type=t;
		acct_balance=b;
	}
	void display()
	{
		System.out.println("Account number ="+acct_num+"\n"+"Account type="+acct_type+"\n"+"Account balance="+acct_balance+" ");
	}
	void deposite_amt(int depo)
	{
		acct_balance=acct_balance+depo;
		System.out.println("balance after deposite="+acct_balance);
	}
	void withdraw(int draw)
	{
		acct_balance=acct_balance-draw;
		System.out.println("remaining balance="+acct_balance);
	}
	
	public static void main(String[] args) {
		Account a=new Account();
		a.acceptDetails(45645,"saving",20000);
		a.display();
		a.deposite_amt(10000);
		a.withdraw(5000);
		
	}

}
