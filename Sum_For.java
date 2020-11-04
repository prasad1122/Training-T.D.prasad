public class Sum_For
{
	public static void main(String args[])
	{
		int sum=0, n=123,rem;
		for(;n>0;)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.print(sum);
	}
}