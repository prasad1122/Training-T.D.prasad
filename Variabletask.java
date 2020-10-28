class Student {
	int student_id;
	int student_age;
	String student_name;
        int student_phno;
	String student_address;
	static String department;
	static String college_name;
	

}
 class Employee
{
	int employee_id;
	String employee_name;
	int salary;
	static String  employee_address;
        String employee_shift;
        String employee_jobtitle;
}
public class Variabletask
{
	public static void main(String[] args)
	{
		Student prasad=new Student();
		prasad.student_id=1235689;
		prasad.student_age=22;
		prasad.student_name="prasad";
		prasad.student_address="Vizag";
		prasad.department="Information Technology";
		prasad.college_name="SRKR college";
		System.out.println("============Student details =============");
		System.out.println("student name is : " +prasad.student_name);
		System.out.println("student age is : " +prasad.student_age);
		System.out.println("student id is : " +prasad.student_id);
		System.out.println("student address is : " +prasad.student_address);
		System.out.println("department name is : " +prasad.department);
		System.out.println("college name is : " +prasad.college_name);
		
		
		Employee ravi=new Employee();
		ravi.employee_id=564;
		ravi.employee_name="ravi";
                ravi.salary=40000;
		ravi.employee_address="vizag";
                ravi.employee_shift="9AM to 5PM";
                ravi.employee_jobtitle="Testing engineer";

		
		System.out.println("===========employee details=================");
		System.out.println("employee name is:"+ravi.employee_name);
		System.out.println("employee id is:"+ravi.employee_id);
		System.out.println("employee salary is:"+ravi.salary);
		System.out.println("employee ph no:"+ravi.employee_address);
		System.out.println("shift is:"+ravi.employee_shift);
		System.out.println("job title is:"+ravi.employee_jobtitle);
		
		
	}
}