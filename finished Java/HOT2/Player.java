public class Player
{
	private String playerName;
	private int playerNumber;
	private int x; //easy way to switch the name and number
public void setPlayerName(int x)
{
		playerName = "Dylan";
		if (x == 2)
			playerName = "John";
}
public void setNumber(int x)
{
	playerNumber = 3;
	if (x == 2)
		playerNumber = 2;
}
public String getPlayerName()
{
	return playerName;
}
public int getNumber()
{
	return playerNumber;
}
}