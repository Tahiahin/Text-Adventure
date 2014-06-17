import java.util.Scanner;
public class VariableScope
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
System.out.print("What is your annual income? ");
double income;
income = keyboard.nextDouble();
if (income >= 35000)
{
System.out.println("For how many years have you worked on yoru current job? ");
int years;
years = keyboard.nextInt();
if (years > 5)
System.out.println("You qualify");
else
System.out.println("You must have been employed for more than five years to qualify.");
}
}
}