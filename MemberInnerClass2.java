import Vehicle.Car;

class Vehicle
{
void Bike()
{
	System.out.println("Bike has two tyres");
}
class Car
{
	void car()
	{
	System.out.println("Car has four tyres");
}
}
}

public class MemberInnerClass2 {
	public static void main(String args[])
	{
		Vehicle tyre=new Vehicle();
		tyre.Bike();
		Vehicle.Car obj=new Vehicle().new Car();
		obj.car();
	}

}
