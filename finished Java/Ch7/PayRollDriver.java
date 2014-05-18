import java.util.Scanner;
public class PayRollDriver
{
public static void main(String[] args)
{
PayRoll pay = new PayRoll();
Scanner key = new Scanner(System.in);
int idNum;
pay.setWages();
System.out.println("What is your employee's ID number? ");
idNum = key.nextInt();
System.out.println("The wages are " + pay.getWages(idNum));
}
}