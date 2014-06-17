import java.util.Scanner;
public class TeacherDriver
{
public static void main(String[] args)
{
Teacher t1 = new Teacher("Duchinsky", "401-K", "8/14/91", "Network", 305);
Teacher t2 = new Teacher();
Scanner key = new Scanner(System.in);
System.out.println("What is the employee name?");
String Name = key.nextLine();
System.out.println("What is the employee number? (format: XXX-L)");
String ID = key.nextLine();
System.out.println("What is the employee hire date?");
String date = key.nextLine();
t2.setName(Name);
t2.setEmployeeNumber(ID);
t2.setHireDate(date);
System.out.println("What is the class name?");
String cn = key.nextLine();
System.out.println("What is the room number?");
int number = key.nextInt();
t2.setClassName(cn);
t2.setRoomNumber(number);
System.out.println(t1.toString());
System.out.println(t2.toString());
}
}