class Mobile
{  
void oneplus()
{
	System.out.println("oneplus");
	}  
}  
class Redmi extends Mobile
{  
void Redmi()
{
	System.out.println("Redmi");
} 
public static void main(String args[])
{
	Redmi mobile=new Redmi();
	mobile.oneplus();
	mobile.Redmi();
}
 
}  
