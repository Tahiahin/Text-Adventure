public class ProductionWorker extends Employee
{
private int Shift;
private double PayRate;
public final int DAY_SHIFT = 1;
public final int NIGHT_SHIFT = 2;
public ProductionWorker(String n, String num, String date, int sh, double rate)
{
super(n, num, date);
Shift = sh;
PayRate = rate;
}
public ProductionWorker()
{
}
public void setPayRate(double rate)
{
PayRate = rate;
}
public void setShift(int sh)
{
Shift = sh;
}
public int getShift()
{
return Shift;
}
public double getPayRate()
{
return PayRate;
}
public String toString()
{
String str = super.toString();
if(Shift == DAY_SHIFT)
str += " day";
else if (Shift == NIGHT_SHIFT)
str += " night";
str += " shift: " + Shift + " pay rate " + PayRate;
return str;
}
}