public class Exception4
{
  public static void main(String1 args[])
  {
    int marks[] ={40,50,60};

    try
    {
      System.out.println(marks[3]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    
    	e.printStackTrace();
    }
  }
}