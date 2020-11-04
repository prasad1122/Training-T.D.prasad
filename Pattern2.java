import java.util.Scanner;
 class pattern2
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int k=1;
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
   for(int j=1;j<=i;j++)
    {
       if(k==1)
        {
           System.out.print(k);
           k--;
         }
         else
         {
            System.out.print(k);
            k++;
         }
    }
   System.out.println();
}
}
}