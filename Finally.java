class Finally{  
  public static void main(String1 args[]){  
  try{  
   int data=25/5;  
  
  }  
  catch(ArithmeticException e)
  {
	 e.printStackTrace();
	  }  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  