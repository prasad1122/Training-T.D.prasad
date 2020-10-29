class Restaurant
{
void menu()
{
System.out.println("1.Idly 2.Poori 3.wada 4.Dosa 5.Noodles 6.fried rice");
}
void takeOrder(String order)
{
System.out.println("The order given by the customer is :" +order);
}
void takeOrder(String order1,String order2,String order3)
{
System.out.println("The order given by the customer is:" +order1+order2+ " and "+order3);
}

String serveFood()
{
return "food is served ";
}

int giveBill(int bill)
{
System.out.println("The Amount to be paid is : "+bill);
return bill;
}
String billPaid()
{
return "Amount Paid"; 
}
}

class Method
{
public static void main(String args[])
{

System.out.println("=============Order 1================");
Restaurant kruthi = new Restaurant();
kruthi.menu();
kruthi.takeOrder("Curd rice");
System.out.println(kruthi.serveFood());
System.out.println("Paid : "+kruthi.giveBill(900));
System.out.println(kruthi.billPaid());
System.out.println("=============Order 2================");
Restaurant kalyani = new Restaurant();
kalyani.menu();
kalyani.takeOrder("Curd rice","Noodles","fried rice");
System.out.println(kalyani.serveFood());
System.out.println("Paid : "+kalyani.giveBill(900));
System.out.println(kalyani.billPaid());
}
}