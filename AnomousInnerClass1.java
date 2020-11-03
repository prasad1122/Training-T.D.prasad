abstract class Employee
{
	abstract void EmployeeId();
	
}

 class AnomousInnerClass1 
{
	public static void main(String args[])
	{
		new Employee()
				{
			void EmployeeId()
			{
				
					System.out.println("Employee id is 152 ");
				
			}
			
		}.EmployeeId();
		
		
	}

}
