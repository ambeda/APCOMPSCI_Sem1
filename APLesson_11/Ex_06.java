import java.util.Scanner; 

public class Ex_06
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in); 
		
		String turn = ""; 
		int damage = 0; 
		int amount = 0; 
		healthCount = 6; 
		health = new String[HEALTHLOAD]; 
		
		while(turn != "Q" && healthCount > 0)
		{
			System.out.println("\n\nYour turn! Hit enter when ready:");
			turn = kb.next(); 
			
			damage = (int)(Math.random()*2 + 1);
			amount = (int)(Math.random()*6 + 1);
			
			takeDamage(damage, amount);
			printClip(); 
		}
		System.out.println("You died!"); 
	}
	
	public static void takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount -= amt;
			System.out.println("Taking " + amt + " damage!"); 
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
				healthCount += amt;
			else
				healthCount = HEALTHLOAD;
			
			System.out.println("Power up " + amt + "!");
		}
		
	}
	
	public static void printClip()
	{
		System.out.print("Health:"); 
		
		for(int i = 0; i < HEALTHLOAD; i++)
		{
			if(i < healthCount)
			{
				health[i] = " @ "; 
			}
			else
			{
				health[i] = "[]";
			}
			System.out.print(health[i]); 
		}
	}
}