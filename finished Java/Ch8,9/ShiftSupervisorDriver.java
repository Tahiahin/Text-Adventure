import java.util.Scanner;
public class ShiftSupervisorDriver
{
public static void main(String[] args)
{
Scanner key = new Scanner(System.in);
ShiftSupervisor p1 = new ShiftSupervisor();
ShiftSupervisor p2 = new ShiftSupervisor("Bessy", "987-g", "2/30/2010", 19.26, 500);
System.out.println("What is the employee name?");
String Name = key.nextLine();
System.out.println("What is the employee id?");
String ID = key.nextLine();
System.out.println("Enter the date hired");
String hiredate = key.nextLine();
System.out.println("Enter the salary");
double salary = key.nextDouble();
System.out.println("Enter the bonus");
double bonus = key.nextDouble();
p1.setSalary(salary);
p1.setName(Name);
p1.setEmployeeNumber(ID);
p1.setHireDate(hiredate);
p1.setBonus(bonus);
System.out.println(p1.toString());
System.out.println(p2.toString());
}
}