package com.motivity;

class Customer
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("going to withdraw...............");
		if(this.amount<amount)
		{
			System.out.println("Less balance go and deposit");
			try
			{
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
	}
	synchronized void deposit(int amount)
	{
		System.out.println("going to deposit");
		this.amount=this.amount+amount;
		System.out.println(" deposit done");
		notify();		
	}
}
public class Waitandnotifyexample {

	public static void main(String[] args) {
		Customer prasad=new Customer();
		new Thread()
		{
			public void run()
			{
				prasad.withdraw(15000);
			}
			
		}.start();
		new Thread()
		{
			public void run()
			{
				prasad.deposit(20000);
			}
			
		}.start();
	}

}
