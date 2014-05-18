public class Employee
{
private String Name, ID, HireDate; 
private boolean status;
public Employee(String n, String num, String date)
{
Name = n;
ID = num;
HireDate = date;
}
public Employee()
{
}
public void setName(String n)
{
Name = n;
}
public void setEmployeeNumber(String num)
{
if(!status)
ID = num;
else
ID = "Invalid";
}
public void setHireDate(String date)
{
HireDate = date;
}
public String getName()
{
return Name;
}
public String getEmployeeNumber()
{
return ID;
}
public String getHireDate()
{
return HireDate;
}
private boolean isValidEmpNum(String e)
{
boolean status = true;
if (e.length() != 5)
status = false;
else if((!Character.isDigit(e.charAt(0))) || (!Character.isDigit(e.charAt(1))) || (!Character.isDigit(e.charAt(2))) || (e.charAt(3) != '-') || (!Character.isLetter(e.charAt(4))))
{
status = false;
}
return status;
}
public String toString()
{
String str = "Name: " + Name + " Employee Number: " + ID + " Hired Date: " + HireDate;
return str;
}
}