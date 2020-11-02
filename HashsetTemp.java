import java.util.HashSet;
import java.util.Iterator;

public class HashSetTemp {

	public static void main(String[] args) {
		HashSet<Integer> salary=new HashSet<Integer>();
		salary.add(45555);
		salary.add(8956);
		salary.add(2356);
		salary.add(89566);
		salary.add(89);
		salary.add(1234);
		
		salary.remove(2356);
		System.out.println("The size of the hashset ="+salary.size());
		System.out.println("The hashset is empty ???   "+salary.isEmpty()); 
		
		Iterator<Integer> i=salary.iterator(); 
		while(i.hasNext())    
		{
			System.out.println(i.next());
		}
		salary.clear();
		System.out.println(salary);
	}

}