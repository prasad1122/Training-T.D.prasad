package serialiazable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class deserialiazble
{
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		FileInputStream fi=new FileInputStream("E:\\student.txt");
		ObjectInputStream dp=new ObjectInputStream(fi);
		Object o=dp.readObject();
		Student prasad=(Student)o;
		System.out.println(prasad.id+" "+prasad.name+" "+prasad.marks);
		
		
	}
	

}
