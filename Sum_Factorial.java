import java.util.*;
class Sum_Factorial 
{
	public static void main(String args[])
	{
		
		int n=145,sum=0,fact=1,rem;
		int fact=1;
		while(n>0)
		{
			rem=n%10;
			fact=1;
			while(rem>0)
			{
				fact=fact*rem;
				rem--;
				
			}
			sum=sum+fact;
			n=n/10;
			
		}
		System.out.println(fact);
		
			
	}
	
}