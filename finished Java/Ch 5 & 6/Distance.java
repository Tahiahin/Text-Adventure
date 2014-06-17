import java.util.Scanner;
import java.io.*;
public class Distance
{
public static void main(String[] args) throws IOException
{
FileWriter traveling = new FileWriter("Travel.txt", true);
PrintWriter calcs = new PrintWriter(traveling);
int hour = 0;
int speed = 0;
int x = 1;
Scanner keyboard = new Scanner(System.in);
while(hour < 1)
{
System.out.println("Please enter the hours");
hour = keyboard.nextInt();
if(hour < 1)
System.out.println("Invalid hours");
}
while(speed < 1)
{
System.out.println("please enter the speed");
speed = keyboard.nextInt();
if(speed < 1)
System.out.println("Invalid speed");
}
Equation travel = new Equation();
calcs.println("Hours - distance");
while(x <= hour)
{
travel.Equation(speed, x);
calcs.println(x + " - " + travel.Source());
x += 1;
}
calcs.close();
}
}