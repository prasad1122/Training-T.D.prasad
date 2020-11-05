public class Exception1
{  
  public static void main (String1 args[])
  {  
	  String1 s="abc";
	  int i=Integer.parseInt(s);
   try{   
	
	 System.out.print(i);
   }
   catch(NumberFormatException   e)
   {
	  e.printStackTrace();
	   }  
  
  }  
} 