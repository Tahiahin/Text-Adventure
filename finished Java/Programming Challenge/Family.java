public class Family
{
public static void main(String[] args)
{
PersonalInfo self = new PersonalInfo("Brad", "8644", 19, "555-5555");
PersonalInfo joe = new PersonalInfo("Joe", "8464", 50, "123-4567");
PersonalInfo john = new PersonalInfo("John", "4468", 39, "111-1111");
System.out.println(self.getName() + " " + self.getAddress() + " " + self.getAge() + " " + self.getphoneNumber());
System.out.println(joe.getName() + " " + joe.getAddress() + " " + joe.getAge() + " " + joe.getphoneNumber());
System.out.println(john.getName() + " " + john.getAddress() + " " + john.getAge() + " " + john.getphoneNumber());
}
}