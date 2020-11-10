import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CreateFile
{
	public static void main(String args[])throws FileNotFoundException
	{
		try
		{
			FileOutputStream ft=new FileOutputStream("E:\\prasad.txt");
			ft.write(72);
			ft.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
		}	
	}

}
