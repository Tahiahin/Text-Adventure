import java.util.Scanner;
public class Sum
{
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int x = 0;
int tot = 0;
int val;
System.out.println("Please type in a non zero integer.");
val = keyboard.nextInt();
while(x <= val)
{
tot += x;
x += 1;
}
System.out.println("The sum of all numbers till " + val + " is " + tot);
}
}