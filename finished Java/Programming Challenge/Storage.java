public class Storage
{
public static void main(String[] args)
{
String n, part, pos;
int id;
Employee Susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
Employee Joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
System.out.println(Susan.getEmployeeName() + "   " + Susan.getEmployeeID() + "   " + Susan.getEmployeeDep() + "   " + Susan.getEmployeePosition());
System.out.println(Mark.getEmployeeName() + "   " + Mark.getEmployeeID() + "   " + Mark.getEmployeeDep() + "   " + Mark.getEmployeePosition());
System.out.println(Joy.getEmployeeName() + "   " + Joy.getEmployeeID() + "   " + Joy.getEmployeeDep() + "   " + Joy.getEmployeePosition());
}
}