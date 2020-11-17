package serialiazable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.ObjectOutputStream;

class Student implements Serializable
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}

public class seriallize 
{
	public static void main(String args[]) throws IOException
	{
		Student prasad=new Student(3151757,"durgaprasad",152);
		FileOutputStream fi=new FileOutputStream("E:\\student.txt");
		ObjectOutputStream ot=new ObjectOutputStream(fi);
		ot.writeObject(prasad);
		ot.flush();
		ot.close();
		
		
		
	}

	
}
