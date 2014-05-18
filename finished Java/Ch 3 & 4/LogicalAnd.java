import java.util.Scanner;
public class LogicalAnd
{
public static void main(String[] args)
{
String input;
char employed, recentGrad;
Scanner keyboard = new Scanner(System.in);
System.out.println("Answer the following questions with either y for Yes");
System.out.println("or n for No.");
System.out.print("Are you employed? ");
input = keyboard.nextLine();
employed = input.charAt(0);
System.out.print("Have you graduated from college in the past two years? ");
input = keyboard.nextLine();
recentGrad = input.charAt(0);
if (employed == 'y' && recentGrad == 'y')
{
		System.out.println("You qualify for the special interest rate.");
}
	else
{
	System.out.println("You must be employed and have graduated in the past two years to qualify.");
}
}
}