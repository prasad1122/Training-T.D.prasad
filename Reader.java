import java.io.FileReader;
import java.io.IOException;



public class Reader
{  
    public static void main(String[] args) throws IOException 
    {  
       
            FileReader reader = new FileReader("E:\\output.txt");  
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }
            
        
    }  
    }
