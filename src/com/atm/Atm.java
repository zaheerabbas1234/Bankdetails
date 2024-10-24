package com.atm;

import java.util.Random;
import java.util.Scanner;

public class Atm {
	
	private int accountno
	private int amount;
	private int pin;
	
	public Atm() {
		super();
		this.accountno = new Random().nextInt(999999);
		this.amount = 5000;
		this.pin = new Random().nextInt(9999);
		welcome();
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void welcome()
	{
		System.out.println("Account no: " + accountno + ", Amount :" + amount + ", Pin : " + pin);  
	}
	
	public String deposit(int accountno,int balance)
	{
		if(accountno != getAccountno())
		{
			return "invalid accountno";
		}
		
		if(amount<0)
		{
			return " invalid amount";
		}
		
		int balance1 = amount+balance;
		
		setAmount(balance1);
		
		System.out.println(balance1);
		
		return "balance credited successfully";
	}
	
	public String pinchange(int accountno,int oldpin,int newpin,int confirmpin)
	{
		if(accountno != getAccountno())
		{
			return "invalid account no";
		}
		
		if(oldpin != getPin())
		{
			return "invalid pin";
		}
		
		if(newpin <1000 || newpin >9999)
		{
			return "pin must be 4 digits";
		}
		
		if(newpin != confirmpin)
		{
			return "newpin and confirm pin should be match";
		}
		
		setPin(confirmpin);
		
		return "pin updated successfully";
	}
	
	public static void main(String[] args) {
		
		Atm  a = new Atm();
		
		Scanner s = new Scanner(System.in);
		
		/* System.out.println("enter account no");
		int accountno = s.nextInt();
		
		System.out.println("enter olpin");
		int oldpin = s.nextInt();
		
		System.out.println("enter newpin");
		int newpin = s.nextInt();
		
		System.out.println("enter confirmpin");
		int confirmpin = s.nextInt();
		
		//String result = a.pinchange(accountno, oldpin, newpin, confirmpin);
		
		//System.out.println(result);
		
		a.welcome();
		*/
		System.out.println("enter accountno");
		int accountno = s.nextInt();
		
		System.out.println("enter amount");
		int amount=s.nextInt();
		
		String bal = a.deposit(accountno, amount);
		System.out.println(bal);
		
		a.welcome();
		
	}

}
