import java.util.Scanner;
public class Population
{
public static void main(String[] args)
{
int start = 1;
int pop = 0;
int breed = 0;
int days = 0;
int x = 2;
Scanner key = new Scanner(System.in);
while(start < 2)
{
System.out.println("What is the starting population?");
start = key.nextInt();
if(start < 2)
System.out.println("Invalid population");
}
while (breed < 1)
{
System.out.println("Enter the average population increase as a percent");
breed = key.nextInt();
if(breed < 1)
System.out.println("Invalid population increase");
}
while(days < 1)
{
System.out.println("Enter the amount of days the population will breed");
days = key.nextInt();
if(days < 1)
System.out.println("Invalid amount of days");
}
pop = start * breed;
while(x <= days)
{
pop *= breed;
x += 1;
}
System.out.println("The final population is " + pop + " organisms");
}
}