import java.util.Scanner;
public class Calculator
{
public static void main(String[] args)
{
Scanner key = new Scanner(System.in);
String shape;
double area;
double rad;
double rad2;
double u = 0.0;
System.out.println("Please enter the shape you want the area for: circle, rectangle, cylinder");
shape = key.nextLine();
if(shape.equals("circle"))
{
System.out.println("Enter in the radius of the circle");
rad = key.nextDouble();
Area.Calc(rad);
}
else if(shape.equals("rectangle"))
{
System.out.println("Enter in the width of the rectangle");
rad = key.nextDouble();
System.out.println("Enter the length of the rectangle");
rad2 = key.nextDouble();
Area.Calc(rad, rad2);
}
else if(shape.equals("cylinder"))
{
System.out.println("Enter the radius of the cylinder");
rad = key.nextDouble();
System.out.println("enter the height of the cylinder");
rad2 = key.nextDouble();
Area.Calc(rad, rad2, u);
}
}
}