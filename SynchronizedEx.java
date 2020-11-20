package com.motivity;

class Trainee
{
	public synchronized void mssg(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("welcome to company: ");
			try
			{
				Thread.sleep(1050);
				System.out.println(name);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}
class Demo extends Thread
{
	Trainee x;
	String name;
	Demo(Trainee x,String name)
	{
		this.x=x;
		this.name=name;
	}
	public void run()
	{
		x.mssg(name);
	}

}
public class SynchronizedEx {

	public static void main(String[] args) {
		Trainee batch=new Trainee();
		Demo m=new Demo(batch,"motivity");
		Demo n=new Demo(batch,"jnit");
		m.start();
		n.start();
		
	}

}
