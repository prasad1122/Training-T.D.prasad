class Mobile  {

	String brand;
	String colour;
	int price;
	String RAM;
	String storage;
	int warranty;
        String camera="48MP";

	Mobile()
{

		 brand="Oneplus";
		 colour="yellow";
		 price=21000;
		 storage="32GB";
                 RAM="3GB";
		 warranty=2;
                 camera="48MP";
	}

	void display() 
{
		System.out.println("brand="+brand);
		System.out.println("colour="+colour);
		System.out.println("price="+price);
		System.out.println("bottle size is="+storage);
		System.out.println("RAM of mobile is="+RAM);
		System.out.println("warranty of the mobile is in years="+warranty);
System.out.println("camera quality for mobile="+camera);

		
	}
}

 class Mobiles
{
	public static void main(String [] args)
	{
	Mobile oneplus =new Mobile();
	oneplus.display();
}
}