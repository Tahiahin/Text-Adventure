import java.text.DecimalFormat;
public class Format2
{
public static void main(String[] args)
{
double number1 = 0.16666667, number2 = 1.666666667, number3 = 16.6666666667, number4 = 166.6666666667;
DecimalFormat formatter = new DecimalFormat("000.00");
System.out.println(formatter.format(number1));
System.out.println(formatter.format(number2));
System.out.println(formatter.format(number3));
System.out.println(formatter.format(number4));
}
}