import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> student =new HashMap<Integer,String>();
		student.put(1,"ravi");
		student.put(2, "Prasad");
		student.put(4,"parasanth");
		student.put(3, "kruthi");
		student.put(4,"banu"); 
		student.remove(3); 
		for(Map.Entry m: student.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println(student);
	}

}