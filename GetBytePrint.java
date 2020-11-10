
import java.io.FileInputStream;
import java.io.IOException;
public class GetBytePrint
{
	public static void main(String args[])throws IOException
	{
			FileInputStream ft=new FileInputStream("E:\\prasad.txt");
			int a=ft.read();
			while(a!=-1)
			{
				System.out.print((char)a);
				a=ft.read();
			}
	}
}


