
class Inheritance
{
    
    int x=3,y=2;
}
class Square extends Inheritance
{
    void add()
    {
        System.out.println(x*y);
    }


	public static void main(String[] args)
	{
		
		Square sum=new Square();
		sum.add();
	}
}

	

