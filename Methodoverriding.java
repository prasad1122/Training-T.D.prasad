class Car
{
void cost()
{
System.out.println("No cost");
}
void milage()
{
System.out.println("No milage");

}

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
class Methodoverriding
{
public static void main(String[] args)
{
Car a=new Car();
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