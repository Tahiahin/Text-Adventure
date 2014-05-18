import java.util.Scanner;
public class States
{
public static void main(String[] args)
{
String ab;
Scanner keyboard = new Scanner(System.in);
System.out.println("Enter in one of the following state abbreviations: NC, SC, GA, FL, AL");
ab = keyboard.nextLine();
if (ab.equals("NC") || ab.equals("SC") || ab.equals("GA") || ab.equals("FL") || ab.equals("AL"))
{
	if (ab.equals("NC"))
System.out.println("North Carolina");
else if (ab.equals("SC"))
System.out.println("South Carolina");
else if (ab.equals("GA"))
System.out.println("Georgia");
else if (ab.equals("FL"))
System.out.println("Florida");
else if (ab.equals("AL"))
System.out.println("Alabama");
}
else
System.out.println("Invalid Abbreviation");
}
}
