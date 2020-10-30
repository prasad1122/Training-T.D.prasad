class College{
	
	void selctCollege() {
		System.out.println("1.srkr 2.Vishnu 3.BVRI 4.Gitam 5.KLU ");
	}
	void selectedCollege(String choice) {
		System.out.println("selected College is "+choice);
		
	}
	int SeatAllowted() {
		return 35000;
	
	}
	String payAmount(int Amount) {
		System.out.println("paying amount for college is "+Amount);
		return "paid";
	}
	String selectedBranch() {
		return "IT";
	}
	int rating() {
		return 3;
	}
	
}





public class Student {

	public static void main(String [] args) {
		College select=new College();
		select.selctCollege();
		select.selectedCollege("SRKR");
		System.out.println(select.SeatAllowted());
		System.out.println(select.payAmount(35000));
		System.out.println( "selected branch is "+select.selectedBranch());
		System.out.println("rating for college is " +select.rating());
	}
	}