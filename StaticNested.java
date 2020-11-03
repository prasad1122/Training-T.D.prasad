class University{
	static class Department{
		void announcement() {
			System.out.println("result are announced");
		}
		static void result() {
			System.out.println("check the website for results");
		}
	}
	
}
public class StaticNested {

	public static void main(String[] args) {
		University.Department IT=new University.Department();
		IT.announcement();
		University.Department.result();

	}

}