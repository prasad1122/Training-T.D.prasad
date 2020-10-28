class Bank
{
static int account_number;
static int IFSC_code;
String bank_branch;
static String account_holder_name;
String bank_name;

}
public class Bankdetails
{
public static void main(String args[])
{
Bank person=new Bank();
person.account_number=332565;
person.IFSC_code=4547;
person.bank_branch="vizag";
person.account_holder_name="prasad durga";
person.bank_name="SBI";
System.out.println("=============================Bank Details================================");
System.out.println("account number:"+person.account_number);
System.out.println("IFSC code:"+person.IFSC_code);
System.out.println("branch name:"+person.bank_branch);
System.out.println("account holder name:"+person.account_holder_name);
System.out.println("bank name:"+person.bank_name);

}
}