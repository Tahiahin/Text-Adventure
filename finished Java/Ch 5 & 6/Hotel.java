import java.util.Scanner;
public class Hotel
{
public static void main(String[] args)
{
int floors = 0;
int rooms = 9;
int x = 1;
int occ = 0;
float rate = 0.0;
int totRooms = 0;
int totOcc = 0;
int vacant = 0;
Scanner key = new Scanner(System.in);
while(floors < 1)
{
System.out.println("How many floors are in the hotel?");
floors = key.nextInt();
if(floors < 1)
System.out.println("You must have at least 1 floor.");
}
while(x <= floors)
{
while(rooms < 10)
{
System.out.println("How many rooms are on floor " + x + "?");
rooms = key.nextInt();
if(rooms < 10)
System.out.println("You must have at least 10 rooms on each floor.");
}
totRooms += rooms;
System.out.println("How many of these rooms is occupied?");
occ = key.nextInt();
if(occ > rooms)
while(occ > rooms)
{
System.out.println("You can not have more rooms occupied than rooms on the floor, please enter a valid number.");
occ = key.nextInt();
}
x += 1;
rooms = 0;
totOcc += occ;
}
vacant = totRooms - totOcc;
System.out.println("There are a total of " + totRooms + " rooms in the hotel, and " + totOcc + " occupied rooms.");
System.out.println("There are " + vacant + " vacant rooms");
rate = (float)totOcc / (float)totRooms;
System.out.println("The occupancy rate for the hotel is " + rate);
}
}