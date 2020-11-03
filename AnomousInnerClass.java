abstract class Employee
{
	abstract void EmployeeId();
	
}

 class AnomousInnerClass 
{
	public static void main(String args[])
	{
		Employee prasad=new Employee()
				{
			void EmployeeId()
			{
				
					System.out.println("Employee id is 152 ");
				
			}
			
		};
		prasad.EmployeeId();
		
	}

}
