public class Area
{
public static void Calc(double rad)
{
double area;
area = Math.PI * (rad * rad);
System.out.println("The area of the circle is " + area);
}
public static void Calc(double rad, double rad2)
{
double area;
area = rad * rad2;
System.out.println("the area of the rectangle is " + area);
}
public static void Calc(double rad, double rad2, double u)
{
double area;
area = Math.PI * (rad * rad) * rad2;
System.out.println("The area of the cylinder is " + area);
}
}