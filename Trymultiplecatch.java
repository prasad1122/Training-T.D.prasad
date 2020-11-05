public class Trymultiplecatch {  
  
    public static void main(String1[] args){  
          
           try{    
        	   int a[]=new int[5];    
               a[5]=30/0;     
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
                          
               System.out.println("rest code");    
    }  
}  