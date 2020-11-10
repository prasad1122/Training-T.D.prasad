import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class GetByte
{
	public static void main(String args[])throws FileNotFoundException
	{
		try
		{
			FileOutputStream ft=new FileOutputStream("E:\\prasad.txt");
			String e="motivity labs";
			ft.write(e.getBytes());
			ft.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
			
		}	
	}

}
