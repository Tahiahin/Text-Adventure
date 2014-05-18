import java.util.Scanner;
public class Rainfall
{
public static void main(String[] args)
{
double[] Rain = new double[12];
int x = 0;
double high = 0.0;
double low = 0.0;
double total = 0.0;
Scanner key = new Scanner(System.in);
while (x < 12)
{
System.out.println("Enter in the rainfall for  month " + (x + 1) + ".");
Rain[x] = key.nextDouble();
total += Rain[x];
if(x == 0)
low = Rain[x];
else
{
if(Rain[x] > high)
high = Rain[x];
else if(Rain[x] < low)
low = Rain[x];
}
}
System.out.println("The total rain fall is " + total);
System.out.println("The highest value for rainfall is " + high);
System.out.println("The lowest value for rainfall is " + low);
}
}