import java.util.Scanner;
public class Pennies
{
public static void main(String[] args)
{
int days = -1;
long total = 0;
long pennies = 1;
Scanner keyboard = new Scanner(System.in);
while(days < 0 || days > 63)
{
System.out.println("How many days did you work? (up to 63)");
days = keyboard.nextInt();
if(days < 0 || days > 63)
System.out.println("Invalid number of days");
}
int x = 1;
if(days > 0)
{
while(x <= days)
{
total += pennies;
System.out.println("Day " + x + " pennies made was " + pennies);
pennies *= 2;
x += 1;
}
System.out.println("You will have made " + total + " pennies");
}
else
System.out.println("You will have made no money");
}
}