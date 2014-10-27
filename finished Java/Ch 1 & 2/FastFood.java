import java.util.Scanner;
public class FastFood
{
	public static void main(String[] args)
	{
		int numberOfHamburgers; //hamburgers
		int numberOfCheeseburgers; //cheeseburgers
		int numberOfSodas; //sodas
		int numberOfFries; //fries
		String Name; //customer name
		double Total; //total cost
		Scanner keyboard = new Scanner(System.in); //needed to access keyboard
		System.out.print("What is your name? ");
		Name = keyboard.nextLine();
		System.out.print("How many hamburgers? ");
		numberOfHamburgers = keyboard.nextInt();
		System.out.print("How many cheeseburgers? ");
		numberOfCheeseburgers = keyboard.nextInt();
		System.out.print("How many sodas? ");
		numberOfSodas = keyboard.nextInt();
		System.out.print("How many fries? ");
		numberOfFries = keyboard.nextInt();
		Total = numberOfHamburgers * 1.25 + numberOfCheeseburgers * 1.50 + numberOfSodas * 1.95 + numberOfFries * .95; //calculate the cost for the total order
		System.out.println(Name.toUpperCase() + " Your total cost will be $" + Total);
	}
}