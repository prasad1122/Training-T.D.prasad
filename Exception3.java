
public class Exception3
{  
  public static void main (String1 args[])
  {  
	  int a[]=new int[9];  
   try{   
	
	   a[10]=50;
   }
   catch(ArrayIndexOutOfBoundsException      e)
   {
	  e.printStackTrace();
	   }  
  
  }  
} 