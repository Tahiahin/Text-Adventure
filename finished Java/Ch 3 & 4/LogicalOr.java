import java.util.Scanner;
public class LogicalOr
{
public static void main(String[] args)
{
double income;
int years;
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your annual income? ");
income = keyboard.nextDouble();
System.out.print("For how many years have you worked at your current job? ");
years = keyboard.nextInt();
if (income >= 35000 || years > 5)
System.out.println("Your qualify for the loan.");
else
System.out.println("You must earn at least $35000 or have been employed for more then five years to qualify.");
}
}