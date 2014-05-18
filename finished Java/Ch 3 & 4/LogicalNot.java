import java.util.Scanner;
public class LogicalNot
{
public static void main(String[] args)
{
double income;
int years;
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your annual income? ");
income = keyboard.nextDouble();
System.out.print("For how many years have you worked on your current job? ");
years = keyboard.nextInt();
if(!(income >= 35000 || years > 5))
System.out.println("You must earn at least $35000 or have been employed for more than five years to qualify.");
else
System.out.println("You qualify for the loan.");
}
}