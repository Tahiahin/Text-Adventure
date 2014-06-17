import java.util.Scanner;
import java.io.*;
public class Sales
{
public static void main(String[] args) throws IOException
{
FileWriter totalSales = new FileWriter("Sales.txt", true);
PrintWriter calcs = new PrintWriter(totalSales);
double amount = 0.0;
double check = 0.0;
Scanner key = new Scanner(System.in);
for(int x = 1; x < 6; x++)
{

System.out.println("What are the sales for day " + x + "?");
check = key.nextDouble();
if(check < 0.0)
{
System.out.println("Invalid value");
x -= 1;
}
else
amount += check;
calcs.println("Day " + x + " sales is " + check);
}
System.out.println("The total sales amount is " + amount);
calcs.println("The total sales is " + amount);
calcs.close();
}
}