import java.io.*;  
public class bufferedwriter
{  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("E:\\demo.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("motivity labs");  
    buffer.close();  
      
    }  
}  