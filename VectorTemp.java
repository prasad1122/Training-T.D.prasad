import java.util.Enumeration;
import java.util.Vector;
public class VectorTemp {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(56);
		v.add(40);
		v.add(22);
		v.add(56);
		v.add(444);
		v.add(568);
		v.add(2356);
		v.add(89);
		v.add(235);
		
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements())    
		{
			System.out.println(e.nextElement());
		}
				

	}

}