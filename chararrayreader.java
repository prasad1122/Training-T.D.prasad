import java.io.CharArrayReader;  
public class chararrayreader
{  
  public static void main(String[] args) throws Exception {  
    char[] ary = { 'm', 'o', 't', 'i', 'v', 'i', 't', 'y' };  
    CharArrayReader reader = new CharArrayReader(ary);  
    int k = 0;  
     
    while ((k = reader.read()) != -1) {  
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
    }  
  }  
}  