import java.util.Scanner;
public class Reverse 
{
    public static void main(String args[])
    {
        int m, n, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = sc.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum=sum*10+n;
            m = m / 10;
        }
        System.out.println("reverse:"+rev);
    }
}