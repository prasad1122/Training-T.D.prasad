import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTemp {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> employee=new LinkedHashMap<Integer,String>();
		employee.put(10, "Prsahanth");
		employee.put(9, "ravi");
		employee.put(235, "Goutham");
		employee.put(45554, "Ganesh");
		employee.put(1008, "vasanth");
		employee.put(1091, "Ramu");
		employee.put(1021, "Sai Krishna");
		employee.put(1201, "Pranav");
		employee.put(1089, "Anirudh");
		employee.put(2056, "Revanth");
		employee.put(1002, "Swethak");
		 for(Entry<Integer, String> m:employee.entrySet())  
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		     }   
		employee.remove(1002);
		employee.put(10,"Shashank"); //Swethak will be updated to shashank
		
		System.out.println("\n\nElements after updating some keys and values\n");
		 for(Entry<Integer, String> m:employee.entrySet())   
		 {    
		       System.out.println(m.getKey()+" "+m.getValue());    
		     }  
	}
}