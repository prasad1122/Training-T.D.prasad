import java.io.BufferedReader;
import java.io.FileReader;
public class Bufferedreader {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("E:\\durga.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i=br.read();    
          while(i!=-1)
          {  
          System.out.print((char)i); 
          i=br.read();
          }  
          br.close();
          fr.close();
        
    }    
}    