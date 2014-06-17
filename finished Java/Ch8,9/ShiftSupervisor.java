public class ShiftSupervisor extends Employee
{
private double salary, bonus;
public ShiftSupervisor(String n, String num, String date, double s, double b)
{
super(n, num, date);
salary = s;
bonus = b;
}
public ShiftSupervisor()
{
}
public void setSalary(double s)
{
salary = s;
}
public void setBonus(double b)
{
bonus = b;
}
public double getSalary()
{
return salary;
}
public double getBonus()
{
return bonus;
}
public String toString()
{
String str = super.toString();
str += " Salary: " + salary + " Bonus: " + bonus;
return str;
}
}