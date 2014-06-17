import java.util.Scanner;
public class Carpet
{
public static void main(String[] args)
{
double length;
double width;
double total;
double cost;
Scanner key = new Scanner(System.in);
System.out.println("Enter the length of the room.");
length = key.nextDouble();
System.out.println("Enter the width of the room.");
width = key.nextDouble();
System.out.println("Enter the cost per square foot of carpet");
cost = key.nextDouble();
total = (length * width) * cost;
System.out.println("The total cost for carpeting your room is $" + total);
}
}