import java.util.Random;
public class Lab_05 
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int playerdice = rand.nextInt(6) + 1;
		System.out.println ("You rolled a " + playerdice);
		int computerdice = rand.nextInt(6) + 1;
		System.out.println ("The computer rolled a " + computerdice);
		
		boolean winner = playerdice > computerdice;
		
		rollDice(playerdice, computerdice, winner);	
	}
	
	public static void rollDice(int playerdice, int computerdice, boolean winner)
	{
		if (winner)
			System.out.println ("You are the winner!");
		if (!winner)
			System.out.println ("You are not the winner.");
	}
}