class Bank
{  
void getRateOfInterest()
{
System.out.println("15");
}

}  
  
  
class SBI extends Bank
{  
void getRateOfInterest()
{
	System.out.println("11");
}  
}  
  
class ICICI extends Bank
{  
void getRateOfInterest(){
System.out.println("10");
}  
}  
class AXIS extends Bank
{  
void getRateOfInterest(){
	System.out.println("9");
	}  
}   
class Upcasting
{  
public static void main(String args[])
{  
Bank demo=new Bank();
demo.getRateOfInterest();
demo=new AXIS();
demo.getRateOfInterest();
demo=new SBI();
demo.getRateOfInterest();
demo=new ICICI();
demo.getRateOfInterest();
 
  
}  
}