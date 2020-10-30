import java.util.*;
class Company
{
   int productid=12345;	
   int price=1000;
}
class Wholesaler extends Company
{
	String s1="footwear";
}
class Retailer extends Wholesaler
{
	int price1 =2000;
}
class Customer extends Retailer
{
	String s2="Amazon";
	int price2=47;
}
class Shop extends Customer
{
    void data()
    {
        System.out.println(productid);
		 System.out.println(s1);
		  System.out.println(price2);
		   System.out.println(s2);
    }
	public static void main(String[] args)
	
	{
		
		Shop shop=new Shop();
		shop.data();
	}
}

	

