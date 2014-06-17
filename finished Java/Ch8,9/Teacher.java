public class Teacher extends Employee
{
private String className = "";
private int roomNum = 0;
public Teacher(String n, String num, String date, String cn, int rn)
{
super(n, num, date);
className = cn;
roomNum = rn;
}
public Teacher()
{
}
public void setClassName(String cn)
{
className = cn;
}
public void setRoomNumber(int rn)
{
roomNum = rn;
}
public String getClassName()
{
return className;
}
public int getRoomNumber()
{
return roomNum;
}
public String toString()
{
String str = super.toString();
str += " Class Name: " + className + " Room number: " + roomNum;
return str;
}
}