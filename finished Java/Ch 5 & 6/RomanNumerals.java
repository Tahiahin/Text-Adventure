import java.util.Scanner;
public class RomanNumerals
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int roman;
System.out.println("Enter a number 1 - 10");
roman = keyboard.nextInt();
if (roman >= 1 && roman <= 10)
{
	if (roman == 1)
		System.out.println("I");
	else if (roman == 2)
		System.out.println("II");
	else if (roman == 3)
		System.out.println("III");
	else if (roman == 4)
		System.out.println("IV");
	else if (roman == 5)
		System.out.println("V");
	else if (roman == 6)
		System.out.println("VI");
	else if (roman == 7)
		System.out.println("VII");
	else if (roman == 8)
		System.out.println("VIII");
	else if (roman == 9)
		System.out.println("IX");
	else if (roman == 10)
		System.out.println("X");
}
else
	System.out.println("Invalid Number");
}
}