import java.util.Scanner;
public class ProductionWorkerDriver
{
public static void main(String[] args)
{
//ProductionWorker p1 = new ProductionWorker();
//ProductionWorker p2 = new ProductionWorker("Peatear Griffin", "123-A", "12/21/2010", 1, 15.25);
Scanner key = new Scanner(System.in);
TeamLeader t1 = new TeamLeader();
TeamLeader t2 = new TeamLeader("Kory Williams", "314-K", "1/15/2010", 1, 500.93, 300.74, 2, 4);
System.out.println("What is the employee name?");
String Name = key.nextLine();
System.out.println("What is the employee number? (format: XXX-L)");
String ID = key.nextLine();
System.out.println("What is the employee hire date?");
String date = key.nextLine();
t1.setName(Name);
t1.setEmployeeNumber(ID);
t1.setHireDate(date);
System.out.println("What is the pay rate?");
double pay = key.nextDouble();
t1.setPayRate(pay);
System.out.println("Enter the shift");
int shift = key.nextInt();
t1.setShift(shift);
System.out.println("Enter the monthly bonus");
double Bonus = key.nextDouble();
t1.setMonthlyBonus(Bonus);
System.out.println("Enter in the required training hours");
double hours = key.nextDouble();
t1.setRequiredTrainingHours(hours);
System.out.println("Enter in the training hours attended");
double Hours = key.nextDouble();
t1.setTrainingHoursAttended(Hours);
System.out.println(t1.toString());
System.out.println(t2.toString());
}
}