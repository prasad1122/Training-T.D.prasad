import java.io.CharArrayWriter;  
import java.io.FileWriter;  
public class chararraywriter {  
public static void main(String args[])throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("motivity labs is in hyderabad");    
          FileWriter f1=new FileWriter("E:\\durga.txt");    
           
          out.writeTo(f1);    
          
          f1.close();    
         
         
         }    
        }    