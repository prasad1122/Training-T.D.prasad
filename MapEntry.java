

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"prasad");
		hm.put(2,"rahul");
		hm.put(3,"pavani");
		hm.put(4,"kruthi");
		hm.put(5,"keerthi");
		hm.put(6,"vamshi");
		hm.put(7,"harika");
		
		Set<Map.Entry<Integer,String>> s= hm.entrySet();
	
		Iterator<Map.Entry<Integer, String>> i = s.iterator();
		while(i.hasNext()) {
			Map.Entry<Integer, String> entry=i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}