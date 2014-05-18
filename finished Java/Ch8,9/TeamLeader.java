public class TeamLeader extends ProductionWorker
{
private double monthlyBonus, requiredTrainingHours, trainingHoursAttended;
public TeamLeader(String n, String num, String date, int sh, double rate, double mb, double rth, double tha)
{
super(n, num, date, sh, rate);
monthlyBonus = mb;
requiredTrainingHours = rth;
trainingHoursAttended = tha;
}
public TeamLeader()
{
}
public void setMonthlyBonus(double b)
{
monthlyBonus = b;
}
public void setRequiredTrainingHours(double p)
{
requiredTrainingHours = p;
}
public void setTrainingHoursAttended(double t)
{
trainingHoursAttended = t;
}
public double getMonthlyBonus()
{
return monthlyBonus;
}
public double getRequiredTrainingHours()
{
return requiredTrainingHours;
}
public double getTrainingHoursAttended()
{
return trainingHoursAttended;
}
public String toString()
{
String str = super.toString();
str += "Monthly Bonus: " + monthlyBonus  + " required training hours: " + requiredTrainingHours + " training hours attended: " + trainingHoursAttended;
return str;
}
}