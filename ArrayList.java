import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayList {	
	public static void main(String[] args) 
	{
		ArrayList<String> names =new ArrayList<String>();
		names.add("ravi");
		names.add("ramu");
		names.add("vasanth");
		names.add("prajathi");
		names.add("Maha");
		names.add("durga");
		names.add("mani");
		names.add("ravi");  
		names.add("pravallika");
		names.add("harish");
		
		System.out.println(names);
		System.out.println(names.contains("harish")); 
		System.out.println(names.contains("ramu")); 
		System.out.println(names.isEmpty());
		names.remove("ravi");
		System.out.println(names);
		
		ListIterator<String> i= names.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}