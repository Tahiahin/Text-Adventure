import java.util.Scanner;
public class Charge
{
public static void main(String[] args)
{
int[] accounts = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 456255555, 5552012, 5050552, 7825077, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
int accountnum;
boolean account = false;
Scanner key = new Scanner(System.in);
System.out.println("Enter in an account number");
accountnum = key.nextInt();
for(int x = 0; x < 18; x++)
{
if(accounts[x] == accountnum)
{
account = true;
break;
}
}
if(account == true)
System.out.println("Your account is valid");
else
System.out.println("Invalid account");
}
}