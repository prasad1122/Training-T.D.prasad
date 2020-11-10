import java.io.FileInputStream;
import java.io.SequenceInputStream;

class Sequenceinputstream {    
  public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("E:\\prasad.txt");    
   FileInputStream input2=new FileInputStream("E:\\durga.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j=inst.read();    
   while(j!=-1){    
    System.out.print((char)j);   
    j=inst.read();
   }    
     
  }    
}    