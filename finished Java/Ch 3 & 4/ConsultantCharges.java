import java.util.Scanner;
public class ConsultantCharges
{
	public static void main(String[] args)
	{
		double hours, charges;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How many horus were worked? ");
		hours = keyboard.nextDouble();
		hours = hours < 5 ? 5 : hours;
		charges = 50.0 * hours;
		System.out.println("The charges are $" + charges);
	}
}