import java.util.Scanner;
import java.util.ArrayList;
public class Test
{
public static void main(String[] args)
{
int[] tests = {95, 92, 67, 88, 55, 97, 76, 82};
boolean valid = false;
int test = 0;
Scanner key = new Scanner(System.in);
System.out.println("Enter in a test grade");
test = key.nextInt();
for(int x = 0; x < tests.length; x++)
{
if(tests[x] == test)
{
valid = true;
break;
}
}
if (valid == true)
System.out.println("That test score is valid");
else
System.out.println("That test score is not valid");
}
}