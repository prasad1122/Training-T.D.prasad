import java.io.StringWriter;

public class stringwriter {
  public static void main(String[] args) {

    String data = "motivity labs ";

    try {
      
      StringWriter output = new StringWriter();
      output.write(data);
      System.out.println("Data in the StringWriter: " + output);

      output.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}