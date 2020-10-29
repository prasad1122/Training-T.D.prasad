class Restaurant
{
void menu()
{
System.out.println("1.Idly 2.Poori 3.wada 4.Dosa 5.Noodles 6.Egg fried rice");
}
void takeOrder(String order)
{
System.out.println("The order given by the customer is : "+order);
}
String serveFood(String food)
{
return food;
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

class Customer
{
public static void main(String args[])
{
Restaurant kruthi = new Restaurant();
kruthi.menu();
kruthi.takeOrder("Noodles");
System.out.println("The food served is : "+kruthi.serveFood("Egg fried rice"));
System.out.println("Paid : "+kruthi.giveBill(200));
System.out.println(kruthi.billPaid());

}
}