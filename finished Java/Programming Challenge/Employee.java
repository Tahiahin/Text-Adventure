public class Employee
{
private String name, department, position;
private int idNumber;
public Employee(String n, int id, String part, String pos)
{
name = n;
department = part;
idNumber = id;
position = pos;
}
public String getEmployeeName()
{
	return name;
}
	public String getEmployeeDep()
	{
		return department;
	}
	public int getEmployeeID()
	{
		return idNumber;
	}
	public String getEmployeePosition()
	{
		return position;
	}
}