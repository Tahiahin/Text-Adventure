public class TextAdventure
{ //Brad Marx
//this is a very basic text adventure
public static void main(String Args)
{
	private string finished = "no";
	Scanner key = new Scanner(System.in);
	System.out.println("Would you like to play a game?");
	finished = key.nextString();
	if(finished == "no")
	{//just a check to see if person wants to play or not
		while(finished == "no")
		{
			System.out.println("Welcome to the last place you will ever call the place that you are at for the time being,");
			System.out.println("You are in a dangerous place where any wrong move can lead to a painful miserable death.");
			System.out.println("You must be careful and make choices with smartness, or you can just kill yourself now.");
			System.out.println("");//To help separate the question from the information, this is not designed to be a story driven game, just nested if statement testing
			System.out.println("(yes/no) Do you want to kill yourself now");
			finished = key.nextString();
			if(finished == "no")
			{
				private string progress = "";
				System.out.println("A torch lights up in the distance, allowing you to see your surroundings.");
				System.out.println("");
				System.out.println("The torch gives off a warm glow, opposite to the void you are in now.");
				System.out.println("");
				System.out.println("(yes/no) Will you head towards the torch?");
				progress = key.nextString();
				if(progress == "no")
				{
					//Correct answer
				}
				else
				{
					System.out.println("You grabbed the torch, and heard a mechanical sound, the ceiling collapsed on top of you.");
				}
			}
			else
			{
S				ystem.out.println("A rock appeared next to you. It floated up and above your head, then dropped. You be dead"); 
			}
		}
	}
else
	System.out.println("That's OK, you can always play later");
}
}