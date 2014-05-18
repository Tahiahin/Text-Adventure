import java.util.Scanner;
public class Payroll
{
double[] employeeId = new double[5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489];
int[] hours = new int[7];
double[] payRate = new double[7];
double wages = new double[7];
Scanner key = new Scanner(System.in);
public void setHours()
{
for (int i = 0; i < employeeId.length; i++)
{
System.out.println("How many hours did employee " + employeeId.length + " work?");
hours[i] = key.nextInt();
}
}
public void setPayRate()
{
for (int i = 0; i < employeeId.length; i++)
{
System.out.println("What is employee + " employeeId.length + "'s payrate?");
payRate[i] = key.nextInt();
while (payRate[i] < 6)
{
System.out.println("Invalid payrate");
System.out.println("What is employee + " employeeId.length + "'s payrate?");
payRate[i] = key.nextInt();
}
}
}
public void setWages()
{
setHours();
setPayRate();
for (int i = 0; i < employeeId.length; i++)
{
wages[i] = payRate[i] * hours[i];
}
}
public double getWages(int value)
{
double element = -1;
boolean status = false;
for (int i = 0; !status && i < employeeId.length; i++)
{
if(employeeId[i] == value)
{
status = true;
element = wages[i];
}
}
return element;
}
}