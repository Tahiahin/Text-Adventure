import java.util.Scanner;
public class BadStringCompare
{
public static void main(String[] args)
{
String name1, name2;
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter a name: ");
name1 = keyboard.nextLine();
System.out.print("Enter another name: ");
name2 = keyboard.nextLine();
if (name1 == name2)
System.out.println(name1 + " and " + name2 + " are the same.");
else
System.out.println(name1 + " and " + name2 + " are NOT the same.");
}
}