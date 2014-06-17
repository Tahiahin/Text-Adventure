import java.util.Scanner;
public class TestResults
{
public static void main(String[] args)
{
int testScore;
char letterGrade;
Scanner keyboard = new Scanner(System.in);
System.out.print("Enter your numeric test score and I will l you the grade: ");
testScore = keyboard.nextInt();
TestGrade test = new TestGrade();
letterGrade = test.getLetterGrade();
if (letterGrade == '?')
System.out.println("The score you entered is invalid.");
else
System.out.print("Your grade is " + letterGrade);
}
}