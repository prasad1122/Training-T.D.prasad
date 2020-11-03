
class Vehicle
{
void Bike()
{
	System.out.println("Bike has two tyres");
	class Car
	{
		void car()
		{
		System.out.println("Car has four tyres");
	}
	}
}

}

public class MemberInnerClass {
	public static void main(String args[])
	{
		Vehicle tyre=new Vehicle();
		tyre.Bike();
		Vehicle.Car obj=tyre.new Car();
		obj.car();
	}

}
