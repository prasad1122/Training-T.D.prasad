
import java.io.FileInputStream;
import java.io.IOException;
public class FileInput
{
	public static void main(String args[])throws IOException
	{
			FileInputStream ft=new FileInputStream("E:\\prasad.txt");
			int a=ft.read();
			System.out.println(a);
			System.out.println((char)a);	
	}
}

