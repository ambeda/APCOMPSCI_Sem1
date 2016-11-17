import java.util.Scanner;
public class Lab_08LuckySevens
{	
	public static void main (String[]arga)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println ("Please type in a number");
		int num = kb.nextInt();	

		System.out.println ("In " + num + " there are " + luck(num) + " sevens.");
	}
	public static int luck(int num)
	{
		if (num > 0)
		{
			if (num % 10 == 7)
				return 1 + luck(num/10);
			else
				return 0 + luck(num/10);
		}
		return 0;
	}
}