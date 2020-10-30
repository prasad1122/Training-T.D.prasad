abstract class Car
{
 abstract void cost();
 abstract void milage();

}
class Audi extends Car
{
void cost()
{
System.out.println("cost is 22lakhs");
}
void milage()
{
System.out.println("milage is 55km");

}
}
class BMW extends Car
{
void cost()
{
System.out.println("cost is 52lakhs");
}
void milage()
{
System.out.println("milage is 89km");

}
}


class Abstractmethod extends Car
{
	public void cost()
	{
	System.out.println("car cost is 50lakhs");
   }
   public void milage()
	{
	System.out.println("car milage is 23km");
   }
public static void main(String[] args)
{
	
	Car a =new Abstractmethod();
Audi b=new Audi();
BMW c=new BMW();
a.cost();
a.milage();
b.cost();
b.milage();
c.cost();
c.milage();
}
}