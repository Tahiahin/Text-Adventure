public class Coach
{
public static void main(String[] args)
{
	String coachName = "Coach Corrigan";
	int x = 1;
	if (coachName == "Coach Corrigan")
		coachName = "Coach Gudmestad";
	Player Dylan = new Player();
	Player John = new Player();
	Dylan.setPlayerName(x);
	Dylan.setNumber(x);
	x = 2; //allows the change in players
	John.setPlayerName(x);
	John.setNumber(x); 
	System.out.println("The coach's name is " + coachName);
	System.out.println("The player " + Dylan.getPlayerName() + " has a jersy number of " + Dylan.getNumber());
	System.out.println("The player " + John.getPlayerName() + " has a jersy number of " + John.getNumber());
}
}