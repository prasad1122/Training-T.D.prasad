
class College
{
	 int id=1223;
	 int  s1=100;
	 String  f1="computers";
	 float f=3;
}
class Student extends College
{
    void display()
   {
      System.out.println("id:"+id);
	   System.out.println("marks:"+s1);
	   System.out.println("branch:"+f1);
	   System.out.println("percantage:"+f);
   }
}
class Hiraricheial
{
  public static void main(String args[])
  {
    Student data = new Student();
     
     data.display();
     
  }
}