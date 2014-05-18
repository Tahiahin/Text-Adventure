import java.text.DecimalFormat;
public class Format3
{
public static void main(String[] args)
{
double number1 = 123.899, number2 = 1234.899, number3 = 12345.899, number4 = 123456.899, number5 = 1234567.899;
DecimalFormat formatter = new DecimalFormat("#,##0.00");
System.out.println(formatter.format(number1));
System.out.println(formatter.format(number2));
System.out.println(formatter.format(number3));
System.out.println(formatter.format(number4));
System.out.println(formatter.format(number5));
}
}