
class Car
{
void Speed()
{
 System.out.println("spedd is 14km");
 }
	
}
class Ferrai extends Car
{
    void race()
	{
	
      System.out.println("cost is 40lakhs");

	   }
	  
   
}
class Audi extends Car
{
void bike()
{
 System.out.println("model is sports car");   
	   }
}
	  class Vehicle
	  {
	  public static void main(String args[])
	  {
		  Car c=new Car();
	  Ferrai a=new Ferrai();
	  Audi b=new Audi();
	  b.bike();
	  a.race();
	  c.Speed();
	  }
	  }
