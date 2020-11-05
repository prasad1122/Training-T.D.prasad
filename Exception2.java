
public class Exception2
{  
  public static void main (String1 args[])
  {  
	  String1 s=null;
	 
   try{   
	
	 System.out.print(s.length());
   }
   catch(NullPointerException     e)
   {
	  e.printStackTrace();
	   }  
  
  }  
} 