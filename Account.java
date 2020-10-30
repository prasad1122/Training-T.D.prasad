class Bank
{  
int getRateOfInterest()
{
return 10;
}

}  
  
  
class SBI extends Bank
{  
int getRateOfInterest()
{
	return 8;
}  
}  
  
class ICICI extends Bank
{  
int getRateOfInterest(){
return 7;
}  
}  
class AXIS extends Bank
{  
int getRateOfInterest(){
	return 9;
	}  
}   
class Account
{  
public static void main(String args[])
{  
Bank g=new Bank();
SBI demo=new SBI();  
ICICI value=new ICICI();  
AXIS temp=new AXIS();  
System.out.println("AXIS Rate of Interest: "+g.getRateOfInterest());
System.out.println("SBI Rate of Interest: "+demo.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+value.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+temp.getRateOfInterest());
  
}  
}