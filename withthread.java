
public class withthread implements Runnable

{
	public static void main(String args[])
	{
		withthread wt=new withthread();
		Thread t=new Thread(wt);
		t.start();
		for(int j=0;j<=10;j++)
		{
			System.out.println("i vlaue is"+j);
		}
		
	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("i vlaue is"+i);
		}
		
	}
	
	
	

}
