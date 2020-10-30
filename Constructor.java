class Employee{
	int employee_id;
	String employee_name;
	int salary;
	String employee_department;
	Employee( int employee_id,String employee_name,int salary,String employee_department){
		this.employee_id=employee_id;
       this.employee_name=employee_name;
     this.salary=salary;
this.employee_department=employee_department;
		
	}
	void display() {
		System.out.println("employee id is="+employee_id);
		System.out.println("employeename is="+employee_name);
		System.out.println("salary="+salary);
		System.out.println(" employee department="+employee_department);
	}
	
}

 class Constructor {
	 public static void main(String []args) {
		 Employee prasad=new Employee(152,"prasad",60000,"Tester");
		 prasad.display();
		 Employee ravi=new Employee(562,"ravi",35000,"Frontend developer");
		 ravi.display();
	 }

}